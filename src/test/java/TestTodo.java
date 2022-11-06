import org.junit.Assert;
import org.junit.Test;
import se.lexicon.TodoItem;

import java.time.LocalDate;

public class TestTodo {

    TodoItem task = new TodoItem(222, "clean", "clean the house");

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


}