import org.junit.Assert;
import org.junit.Test;
import se.lexicon.TodoItem;

import java.time.LocalDate;

public class TestTodo {

    //TodoItem task = new TodoItem(222, "clean", "clean the house", LocalDate.parse("2020-10-10"), true, "Mohammad"); //Why doesnt this work?
    TodoItem task = new TodoItem("Cleaning", "Clean the house", LocalDate.parse("2020-10-10"));
    @Test

    public void testTitle() {
        String expected = "clean";
        String actual = task.getTitle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTaskDescription() {
        String expected = "clean the house";
        String actual = task.getTaskDescription();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testId() {
        int expected = 222;
        int actual = task.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeadLine() {
        LocalDate expected = LocalDate.of(2022,11,6);
        LocalDate actual = task.getDeadLine();
        Assert.assertEquals(expected, actual);
    }

   @Test
    public void testSummary() {
        String actual= task.toString();
        String expected = "Task#1 Title: clean, Task description: clean the house, ID: 222, Creator: null, Deadline: 2022-11-06";
        Assert.assertEquals(expected, actual);
    }

}
