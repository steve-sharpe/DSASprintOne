public class TaskList {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsCompleted(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                current.task.markAsCompleted();
                System.out.println("Task marked as completed: " + current.task.getDescription());
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Task not found.");
    }

    public void printTasks() {
        Node current = head;
        if (current == null) {
            System.out.println("  No tasks found.");
            return;
        }
        int index = 0;
        while (current != null) {
            System.out.printf("  %d. %s%n", index++, current.task);
            current = current.next;
        }
    }
}
