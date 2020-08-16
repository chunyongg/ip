public class Task {
    String taskName;
    boolean isCompleted;
    Task(String task) {
        this.taskName = task;
        this.isCompleted = false;
    }

    private Task(String task, boolean isCompleted) {
        this.taskName = task;
        this.isCompleted = isCompleted;
    }

    public Task setTaskAsCompleted() {
        return new Task(taskName, true);
    }

    @Override
    public String toString() {
        String tickOrCross  = isCompleted? "\u2713" : "\u2717";
        return String.format("%s %s %s %s", "[", tickOrCross, "] ", taskName);
    }
}