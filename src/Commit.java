import java.util.List;

public class Commit {
    private final String id;
    private final String message;
    private final List<FileSnapshot> snapshot;
    private final Commit parent;

    public Commit(String id, String message, List<FileSnapshot> snapshot, Commit parent) {
        this.id = id;
        this.message = message;
        this.snapshot = snapshot;
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Commit getParent() {
        return parent;
    }

    public List<FileSnapshot> getSnapshot() {
        return snapshot;
    }
}
