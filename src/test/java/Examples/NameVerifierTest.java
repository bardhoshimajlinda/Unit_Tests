package Examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NameVerifierTest {

    private NameVerifier nameVerifier;

    @BeforeEach
    void setUp() {
        nameVerifier = new NameVerifier();
    }

    @Test
    void shouldValidateName() {
        //given
        String name = "Adam";

        //when
        final boolean validationResult = nameVerifier.isNameValid(name);

        //then
        assertTrue(validationResult);
    }

    @Test
    void shouldNotValidateNameWhenAllLettersAreLowerCase() {
        String name = "adam";

        final boolean validationResult = nameVerifier.isNameValid(name);
        assertFalse(validationResult);
    }

    @Test
    void shouldNotValidateEmptyName() {
        String name = "";

        final boolean validationResult = nameVerifier.isNameValid(name);
        assertFalse(validationResult);
    }

    @Test
    void shouldNotValidateNullName() {
        String name = null;

        final boolean validationResult = nameVerifier.isNameValid(name);
        assertFalse(validationResult);
    }
}