package Examples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class CalculatorTestWithAssertJ {

    @Test
    public void shouldAddTwoNumbers() {
        int first = 2;
        int second = 4;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.add(first,second);

        // Using AssertJ assertion
        assertThat(expectedResult).isEqualTo(6);
    }


    @Test
    public void shouldSubtractTwoNumbers() {
        int first = 6;
        int second = 10;

        Calculator calculator = new Calculator();
        int result = calculator.subtract(first, second);

        assertThat(result).isEqualTo(-4);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        int first = 3;
        int second = 3;

        Calculator calculator = new Calculator();
        int result = calculator.multiply(first, second);

        assertThat(result).isEqualTo(9);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        double first = 4;
        double second = 2;

        double result = Calculator.divide(first, second);

        assertThat(result).isEqualTo(2.0);
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        double first = 4;
        double second = 0;

        assertThatThrownBy(() -> Calculator.divide(first, second))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cannot divide by 0");
    }
}
