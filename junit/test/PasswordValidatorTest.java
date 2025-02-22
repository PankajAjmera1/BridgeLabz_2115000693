package test;
import src.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongPass1"));
    }

    @Test
    public void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Short1"));
    }

    @Test
    public void testNoUpperCase() {
        assertFalse(PasswordValidator.isValid("lowercase1"));
    }

    @Test
    public void testNoDigit() {
        assertFalse(PasswordValidator.isValid("NoDigitPass"));
    }
}
