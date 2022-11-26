
import org.junit.Assert;
import org.junit.Test;
import se.lexicon.model.Person;


public class PersonTest {
    //Person mohammad = new Person(111,"Mohammad","Alissa","Mohammad.alissa95@hotmail.com", "clean"); //Why is it error here?
    Person mohammad = new Person("Mohammad","Alissa");


    @Test
    public void testFastName() {
        String actual = mohammad.getFirstName();
        String expected = "Mohammad";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLastName() {
        String actual = mohammad.getLastName();
        String expectedLastName = "Alissa";
        Assert.assertEquals(expectedLastName, actual);
    }

    @Test
    public void testEmail() {
        String actual = mohammad.getEmail();
        String expected = "Mohammad.alissa95@hotmail.com";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testId() {
        int expected = 111;
        int actual = mohammad.getId();
        Assert.assertEquals(expected, actual);
    }

   /* @Test
   public void testSummary() {
        String actual= mohammad.getSummary();
        String expected = " Person FirstName: Mohammad, LastName: Alissa, ID: 111, Email: Mohammad.alissa95@hotmail.com";
        Assert.assertEquals(expected, actual);
    } */

    @Test
    public void testSummary() {
        String actual= mohammad.toString();
        String expected = "Name: Mohammad Alissa, ID: 111, Email: Mohammad.alissa95@hotmail.com";
        Assert.assertEquals(expected, actual);
    }
}
