import java.util.*;
public class StagingArea {
    private final Set<String> stagedFiles = new HashSet<>();

    public void stagedFile(String fileName){
        stagedFiles.add(fileName);
        System.out.println(fileName+" staged.");
    }


    public  boolean isEmpty(){
        return stagedFiles.isEmpty();
    }

    public List<FileSnapshot> getSnapshot(){
        List<FileSnapshot> list = new ArrayList<>();
        for(String file : stagedFiles){
            list.add(new FileSnapshot(file));
        }
        return list;
    }

    public void clear(){
        stagedFiles.clear();
    }

    public Set<String> getStagedFiles(){
        return stagedFiles;
    }
}
