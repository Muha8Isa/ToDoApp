package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;


public class TodoItem {
    private Integer id; //Should this be reference class? In the assignment description it says int, so I assumed it should be primitive data type.
    private String title; // Should not be null
    private String taskDescription;
   // public static LocalDate deadLine = LocalDate.parse("2022-11-06"); // Should not be null;
    private LocalDate deadLine;
    //public static LocalDate currentDate = LocalDate.now(); // Should not be null
    private boolean done;
    private Person creator;

    // todo: remove static fields
    private static int order = 0;
    private static int sequencer = 0;

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) { // This is to fetch TodoItem from Collection.
        setTitle(title);
        setTaskDescription(taskDescription);
        setId(id);
        setDeadLine(deadLine);
        setDone(done);
        setCreator(creator);
        this.order = ++sequencer;
    }

    public TodoItem(String title, String taskDescription, LocalDate deadLine) { // This is to create TodoItem.
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        // todo: improve the code
        this.creator = creator;
    }

    public LocalDate getDeadLine() {
        if (deadLine == null) throw new IllegalArgumentException("Deadline param was null");
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isOverdue(){
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isAfter(deadLine)) return true; // return (currentDate.isAfter(deadLine)); and delete return false.
        return false;
    }


    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", PeronName=" + creator.getFirstName() + " " + creator.getLastName() +
                '}';
    }

    @Override
    public boolean equals(Object o) { // Should I have one for creator?
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && Objects.equals(title, todoItem.title) && Objects.equals(taskDescription, todoItem.taskDescription) && Objects.equals(deadLine, todoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadLine, done);
    }
}
