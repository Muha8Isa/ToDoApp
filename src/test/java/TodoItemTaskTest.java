import org.junit.Assert;
import org.junit.Test;
import se.lexicon.model.Person;
import se.lexicon.model.TodoItem;
import se.lexicon.model.TodoItemTask;

public class TodoItemTaskTest {

    TodoItemTask task = new TodoItemTask();
    //Person mohammad = new Person(111,"Mohammad","Alissa","Mohammad.alissa95@hotmail.com", "clean"); //Why is it error here?
    Person mohammad = new Person("Mohammad","Alissa");

    @Test
    public void testAssignee() {
        Person expected = mohammad;
        Person actual =  task.getAssignee();
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
        TodoItem actual = task.getTodoItem();
        Assert.assertEquals(expected, actual);

    }



}