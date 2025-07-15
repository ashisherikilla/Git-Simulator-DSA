import java.util.UUID;

public class Utils {
    public static String generateCommitId(){
        return UUID.randomUUID().toString().substring(0,6);
    }
}
