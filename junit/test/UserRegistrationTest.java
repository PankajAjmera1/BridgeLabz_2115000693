package test;
import src.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("JohnDoe", "john@example.com", "SecurePass1"));
    }

    @Test
    public void testEmptyFields() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "email@example.com", "password"));
    }

    @Test
    public void testInvalidEmailFormat() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("User", "invalid-email", "password123"));
    }

    @Test
    public void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("User", "email@example.com", "pass"));
    }
}
