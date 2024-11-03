import java.util.Scanner;

public class Main {
    private static final int MAX_USERS = 10;
    private static User[] users = new User[MAX_USERS];
    private static int userCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== To-Do List Manager ===");
            System.out.println("1. Create User");
            System.out.println("2. Add Task to User");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View User Tasks");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (userCount < MAX_USERS) {
                        System.out.print("Enter user name: ");
                        String userName = scanner.nextLine();
                        users[userCount++] = new User(userName);
                        System.out.println("User created: " + userName);
                    } else {
                        System.out.println("User limit reached.");
                    }
                    break;
                case 2:
                    listUsers();
                    System.out.print("Enter user index to add a task (0 to " + (userCount - 1) + "): ");
                    int userIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (userIndex >= 0 && userIndex < userCount) {
                        System.out.print("Enter task description: ");
                        String taskDescription = scanner.nextLine();
                        users[userIndex].addTask(taskDescription);
                        System.out.println("Task added: " + taskDescription);
                    } else {
                        System.out.println("Invalid user index.");
                    }
                    break;
                case 3:
                    listUsers();
                    System.out.print("Enter user index to mark a task as completed (0 to " + (userCount - 1) + "): ");
                    userIndex = scanner.nextInt();
                    if (userIndex >= 0 && userIndex < userCount) {
                        // List tasks before marking one as completed
                        users[userIndex].printTasks();
                        System.out.print("Enter task index to mark as completed: ");
                        int taskIndex = scanner.nextInt();
                        users[userIndex].markTaskAsCompleted(taskIndex);
                    } else {
                        System.out.println("Invalid user index.");
                    }
                    break;
                case 4:
                    listUsers();
                    System.out.print("Enter user index to view tasks (0 to " + (userCount - 1) + "): ");
                    userIndex = scanner.nextInt();
                    if (userIndex >= 0 && userIndex < userCount) {
                        users[userIndex].printTasks();
                    } else {
                        System.out.println("Invalid user index.");
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        System.out.println("Exiting To-Do List Manager. Goodbye!");
        scanner.close();
    }

    private static void listUsers() {
        System.out.println("\nUsers:");
        for (int i = 0; i < userCount; i++) {
            System.out.println("  " + i + ": " + users[i].getName());
        }
    }
}
