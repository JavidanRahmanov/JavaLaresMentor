package MentorTasks.imtahan;

public class Task {

    private String name;
    private PriorityLevel priority;
    private TaskStatus status;

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    public void setPriority(PriorityLevel priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Task(String name, PriorityLevel priority, TaskStatus status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }
}
