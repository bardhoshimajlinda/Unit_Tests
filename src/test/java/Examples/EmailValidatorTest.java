package Examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    public void testValidEmail() {
        assertTrue(EmailValidator.isValidEmail("majlinda@gmail.com"));
        assertTrue(EmailValidator.isValidEmail("majli123@gmail.com"));
        assertTrue(EmailValidator.isValidEmail("test@example.com"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(EmailValidator.isValidEmail("test@email"));
        assertFalse(EmailValidator.isValidEmail("test@.com"));
        assertFalse(EmailValidator.isValidEmail(""));
    }



}