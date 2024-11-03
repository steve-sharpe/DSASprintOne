# To-Do List Manager

## Project Overview

The **To-Do List Manager** is a simple Java application that allows users to create and manage their own to-do lists. Users can add tasks, mark them as completed, and view their tasks. The application demonstrates the use of arrays and singly linked lists in Java for user and task management.

## Features

- **User Management**: Create users and store them in an array, ensuring each user has a unique name.
- **Task Management**:
  - Add tasks to a user's to-do list.
  - Each task has a description and a completion status (completed or pending).
- **Task Completion**: Mark tasks as completed, with completed tasks displayed with an "X".
- **View Tasks**: Display all tasks in a user's to-do list along with their completion status.

## Implementation Details

### Classes

1. **Task**:
   - Represents a single task with a description and completion status.
   - Includes methods to mark a task as completed and convert the task to a string for display.

2. **User**:
   - Represents a user with a unique name and a to-do list.
   - Includes methods to add tasks, mark tasks as completed, and print all tasks.

3. **TaskList**:
   - Implements a singly linked list to manage tasks for each user.
   - Provides methods to add a task, mark a task as completed, and print all tasks.

4. **Main**:
   - The entry point of the application.
   - Manages user interactions and orchestrates the functionality of the other classes.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your machine.
- An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or any text editor of your choice.

### Installation

1. Clone this repository to your local machine using the following command:
   ```bash
   git clone https://github.com/yourusername/todo-list-manager.git
   ```
   *(Replace `yourusername` with your actual GitHub username)*

2. Navigate to the project directory:
   ```bash
   cd todo-list-manager
   ```

3. Open the project in your preferred IDE or text editor.

### Running the Application

1. Compile the Java files:
   ```bash
   javac *.java
   ```

2. Run the main class:
   ```bash
   java Main
   ```

3. Follow the on-screen instructions to create users, add tasks, mark tasks as completed, and view tasks.

## Example Output

```
=== To-Do List Manager ===
1. Create User
2. Add Task to User
3. Mark Task as Completed
4. View User Tasks
5. Exit
Select an option: 1
Enter user name: John Doe
User created: John Doe

John Doe's To-Do List:
  0. [ ] Task 1
  1. [X] Task 2
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by the need for task management in daily life.
- This project is a learning exercise in Java programming and data structures.
