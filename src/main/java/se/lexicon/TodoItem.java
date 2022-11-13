package se.lexicon;

import java.time.LocalDate;


public class TodoItem {
    private int id;
    private String title; // Should not be null
    private String taskDescription;
    public static LocalDate deadLine = LocalDate.parse("2022-11-06"); // Should not be null;
    public static LocalDate currentDate = LocalDate.now(); // Should not be null
    private boolean done;
    private Person creator;
    private static int order = 0;
    private static int sequencer = 0;


    public static void deadLine() {
        if (currentDate.isAfter(deadLine)) {
            System.out.println("Deadline has passed");
        }
    }

    public TodoItem(int id, String title, String taskDescription) {
        setTitle(title);
        setTaskDescription(taskDescription);
        setId(id);
        this.order = ++sequencer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("title param was null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public LocalDate getDeadLine() {
        if (deadLine == null) throw new IllegalArgumentException("Deadline param was null");
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

      /*  public String getSummary () {
            return " Task#" + order + " Title: " + title + ", Task description: " + taskDescription + ", ID: " + id + ", Creator: " + creator +", Deadline: " + deadLine;
        }*/
      @Override
      public boolean equals(Object obj) {
          return true;
      }

    @Override
    public int hashCode() {
        return hashCode();
    }


    @Override
    public String toString() {
        return "Task#" + order + " Title: " + title + ", Task description: " + taskDescription + ", ID: " + id + ", Creator: " + creator + ", Deadline: " + deadLine;
    }

}
