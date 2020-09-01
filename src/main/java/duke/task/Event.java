package duke.task;

import duke.task.Task;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
  LocalDate time;

  public Event(String taskName, LocalDate date) {
    super(taskName);
    this.time = date;
  }

  public Event(String taskName, LocalDate time, boolean isCompleted) {
    super(taskName, isCompleted);
    this.time = time;
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
    String timeFormatted = time.format(formatter);
    return String.format("%s%s%s%s", "[E]", super.toString(), "(at: ", timeFormatted + ")");
  }
}
