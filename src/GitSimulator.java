import java.util.*;

public class GitSimulator {
    private final Repository repository = new Repository();
    private final Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Git Simulator using DSA + OOPs!");
        // welcoming into simulator
        // condition to run everytime
        while (true) {
            System.out.print("> ");
            // Taking input
            String input = sc.nextLine();
            String[] parts = input.split(" ", 2);
            String command = parts[0];

            // using switch case to handle git commands
            switch (command) {
                // case 1 : init
                case "init":
                    repository.init();
                    break;

                // case 2 : "add"
                case "add":
                    if (parts.length > 1) {
                        repository.add(parts[1]);
                    } else {
                        System.out.println("File name required.");
                    }
                    break;

                // case 3 : "commit"
                case "commit":
                    if (parts.length > 1 && parts[1].startsWith("-m")) {
                        String message = parts[1].substring(2).trim().replace("\"", "");
                        repository.commit(message);
                    }
                    break;
                // case 4 : "log"
                case "log":
                    repository.log();
                    break;

                // case 5 : "status"
                case "status":
                    repository.status();
                    break;

                // case 6 : "exit"
                case "exit":
                    System.out.println("Exiting Git Simulator....");
                    break;

                // default case
                default:
                    System.out.println("Unknown command. Try init, add, commit, log, status, exit.");
            }

        }
    }
}
