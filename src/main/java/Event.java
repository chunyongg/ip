public class Event extends Task {
    String time;
    Event(String taskName, String time) {
        super(taskName);
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("%s%s %s%s", "[E]", super.toString(), "(at: ", time + ")");
    }
}
