import org.junit.Assert;
import org.junit.Test;
import se.lexicon.Person;
import se.lexicon.TodoItemTask;

public class TodoItemTaskTest {

    TodoItemTask task = new TodoItemTask();
    Person mohammad =  new Person(123, "Mohammad","Alissa", "Mohammad.alissa95@hotmail.com");


    @Test
    public void testAssignee() {
        Person expected = mohammad;
        String actual =  task.getAssignee();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testIsAssigned() {
        task.setAssigned(true);
        boolean actual = task.isAssigned();
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTodoItem() {
        task.setTodoItem("clean, eat, study");
        String expected = ("clean, eat, study");
        String actual = task.getTodoItem();
        Assert.assertEquals(expected, actual);

    }



}