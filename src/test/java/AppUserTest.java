import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.AppRole;
import se.lexicon.model.AppUser;

import static org.junit.Assert.*;

public class AppUserTest {


    private AppUser testObject;


    @Before
    public void setup() {
        testObject = new AppUser("user", "password", AppRole.ROLE_APP_ADMIN); //How to change the constructor here?
    }
    @Test
    public void testObject_successfully_instantiated(){
        assertEquals("user", testObject.getUsername());
        assertNotEquals("USER", testObject.getUsername());
        assertEquals("password", testObject.getPassword());
        assertEquals(AppRole.ROLE_APP_ADMIN, testObject.getRoles());
    }
   /* @Test
    public void test_throws_IllegalArgumentException_on_null_username(){
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                AppUser test = new AppUser(null, "password", Role.ROLE_USER);
            }
        }); */ //What  to use here in junit 4?
}
