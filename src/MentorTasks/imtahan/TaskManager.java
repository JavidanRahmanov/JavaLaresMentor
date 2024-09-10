package MentorTasks.imtahan;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;


    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) throws DuplicateTaskException {

        for (Task task1 : tasks) {

            if (task1.getName().equals(task.getName()))
                throw new DuplicateTaskException("There is already task with the same name!");
        }
        tasks.add(task);
    }

    public void removeTask(String name) {

        Task temp = null;
        boolean isFound = false;

        for (int i = 0; i < tasks.size(); i++) {

            if (name.equals(tasks.get(i).getName())) {
                isFound = true;
                temp = tasks.get(i);

            }
        }

        tasks.remove(temp);
        if (!isFound)
            System.out.println("No task found!");
    }

    public void displaySpecificTask(TaskStatus status) {

        for (Task task : tasks) {

            if (task.getStatus() == status)
                System.out.println(task);
        }
    }

    public void updateTask(String name, TaskStatus status) {

        boolean isFound = false;
        for (Task task : tasks) {

            if (task.getName().equals(name)) {

                isFound = true;
                task.setStatus(status);
            }
        }
        if (!isFound)
            System.out.println("No task found!");
    }

    public void displayStatusCount() {

        int newTasks = 0;
        int inProgressTasks = 0;
        int completedTasks = 0;

        for (Task task : tasks) {

            if (task.getStatus() == TaskStatus.NEW) {
                newTasks++;

            } else if (task.getStatus() == TaskStatus.IN_PROGRESS) {
                inProgressTasks++;

            } else {
                completedTasks++;

            }
        }
        System.out.println("New tasks: " + newTasks);
        System.out.println("Tasks in progress: " + inProgressTasks);
        System.out.println("Completed tasks: " +completedTasks);
    }

    public void displayTasks() {

        for (Task task : tasks) {

            System.out.println(task);
        }
    }

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        try {
            manager.addTask(new Task("Cavi", PriorityLevel.LOW, TaskStatus.COMPLETED));
            manager.addTask(new Task("Cavid", PriorityLevel.HIGH, TaskStatus.IN_PROGRESS));
            manager.addTask(new Task("David", PriorityLevel.MEDIUM, TaskStatus.COMPLETED));
            manager.addTask(new Task("Cavi", PriorityLevel.LOW, TaskStatus.COMPLETED));
        } catch (DuplicateTaskException e) {
            System.out.println(e.getMessage());
        }

        try {
            manager.addTask(new Task("Cavidan", PriorityLevel.HIGH, TaskStatus.IN_PROGRESS));
            manager.addTask(new Task("Carl", PriorityLevel.MEDIUM, TaskStatus.NEW));
            manager.addTask(new Task("John", PriorityLevel.LOW, TaskStatus.COMPLETED));
            manager.addTask(new Task("Ferid", PriorityLevel.HIGH, TaskStatus.IN_PROGRESS));
            manager.addTask(new Task("Ilyas", PriorityLevel.MEDIUM, TaskStatus.NEW));
        } catch (DuplicateTaskException e) {
            System.out.println(e.getMessage());
        }


        manager.displayTasks();
        manager.removeTask("John");
        System.out.println("--------------------------------------");
        manager.displayTasks();

        System.out.println("--------------------------------------");
        manager.displaySpecificTask(TaskStatus.COMPLETED);
        System.out.println("-------------------------------------");
        manager.updateTask("Carl", TaskStatus.COMPLETED);
        manager.displayTasks();
        System.out.println("--------------------------------------");

        manager.displayStatusCount();
    }
}