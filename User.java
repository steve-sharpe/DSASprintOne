public class User {
    private String name;
    private TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        taskList.addTask(new Task(description));
    }

    public void markTaskAsCompleted(int index) {
        taskList.markTaskAsCompleted(index);
    }

    public void printTasks() {
        System.out.println("\n" + name + "'s To-Do List:");
        taskList.printTasks();
    }

    public TaskList getTaskList() {
        return taskList;
    }
}
