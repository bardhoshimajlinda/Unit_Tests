package Examples.ExampleB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class StringUtilsTest {
    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    void shouldUpperCaseInputs() {
        final List<String> inputs = List.of("Hello", "From", "here");
        final List<String> expectedOutput = List.of("HELLO", "FROM", "HERE");

        final List<String> actualOutputs = stringUtils.toUpperCase(inputs);

        assertLinesMatch(expectedOutput, actualOutputs);
    }
    @Test
    @DisplayName("Test that checks toLowerCase method behavior")
    void shouldLowerCaseInputs() {
        final List<String> inputs = List.of("Hello", "From", "HERE");
        final List<String> expectedOutput = List.of("hello", "from", "here");

        final List<String> actualOutputs = stringUtils.toLowerCase(inputs);

        assertLinesMatch(expectedOutput, actualOutputs);
    }

    @Test
    @Disabled("waiting for actual method implementation. TDD approach")
    void shouldSnakeCaseInputs() {
        final List<String> inputs = List.of("helloFrom", "testExamples");
        final List<String> expectedOutput = List.of("hello_from", "test_example");

        final List<String> actualOutputs = stringUtils.toLowerCase(inputs);

        assertLinesMatch(expectedOutput, actualOutputs);
    }

}