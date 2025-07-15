import java.util.*;



public class Repository {
    private Commit head;
    private final StagingArea stagingArea = new StagingArea();
    private final List<Commit> commitHistory = new ArrayList<>();

    // init method logic
    public void init() {
        if (head != null) {
            System.out.println("Repository already initialized.");
        } else {
            head = null;
            commitHistory.clear();
            System.out.println("Repository initialized.");
        }
    }

    // add method logic
    public void add(String fileName) {
        stagingArea.stagedFile(fileName);
    }

    // commit method logic
    public void commit(String message) {
        if (stagingArea.isEmpty()) {
            System.out.println("No files to commit.");
            return;
        }
        String id = Utils.generateCommitId();
        List<FileSnapshot> snapshot = stagingArea.getSnapshot();
        Commit newCommit = new Commit(id, message, snapshot, head);
        head = newCommit;
        commitHistory.add(newCommit);
        stagingArea.clear();

        System.out.println("[" + id + "] Commit created: " + message);
    }

    // log method logic
    public void log() {
        if (head == null) {
            System.out.println("No Commits yet.");
            return;
        }
        Commit current = head;
        while (current != null) {
            System.out.println("[" + current.getId() + "] " + current.getMessage());
            current = current.getParent();
        }
    }

    // status method logic
    public void status(){
        if(stagingArea.isEmpty()){
            System.out.println("No files staged.");
        }else{
            System.out.println("Files staged for commit: ");
            for(String file : stagingArea.getStagedFiles()){
                System.out.println(" - "+file);
            }
        }
    }
}
