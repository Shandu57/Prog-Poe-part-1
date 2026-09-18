import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the CONVOS Part 1 Login class.
 */
public class LoginTest {

    private Login createValidUser() {
        return new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );
    }

    @Test
    public void testValidUsername() {
        Login user = createValidUser();
        assertTrue(user.checkUserName());
    }

    @Test
    public void testInvalidUsername() {
        Login user = new Login(
                "kyle!!!!!!!",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );
        assertFalse(user.checkUserName());
    }

    @Test
    public void testValidPassword() {
        Login user = createValidUser();
        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testInvalidPassword() {
        Login user = new Login(
                "kyl_1",
                "password",
                "+27838968976",
                "Kyle",
                "Smith"
        );
        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testValidCellPhoneNumber() {
        Login user = createValidUser();
        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testInvalidCellPhoneNumber() {
        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "08966553",
                "Kyle",
                "Smith"
        );
        assertFalse(user.checkCellPhoneNumber());
    }

    @Test
    public void testSuccessfulLogin() {
        Login user = createValidUser();
        assertTrue(user.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testFailedLogin() {
        Login user = createValidUser();
        assertFalse(user.loginUser("wrong_user", "wrongPassword1!"));
    }

    @Test
    public void testSuccessfulLoginStatus() {
        Login user = createValidUser();
        assertEquals(
                "Welcome Kyle, Smith it is great to see you again.",
                user.returnLoginStatus("kyl_1", "Ch&&sec@ke99!")
        );
    }

    @Test
    public void testFailedLoginStatus() {
        Login user = createValidUser();
        assertEquals(
                "Username or password incorrect, please try again.",
                user.returnLoginStatus("wrong_user", "wrongPassword1!")
        );
    }

    @Test
    public void testRegisterUserRejectsInvalidDetails() {
        Login user = new Login(
                "Shandukani_5",
                "johnfoster@571",
                "08966553",
                "Shandukani",
                "Nesengani"
        );
        assertNotEquals("Registration successful.", user.registerUser());
    }

    @Test
    public void testMyValidDemoDetails() {
        Login user = new Login(
                "Shan_5",
                "John@571",
                "+27838968976",
                "Shandukani",
                "Nesengani"
        );

        assertTrue(user.checkUserName());
        assertTrue(user.checkPasswordComplexity());
        assertTrue(user.checkCellPhoneNumber());
    }
}
