package Examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        // given
        int first = 1;
        int second = 2;

        Calculator calculator = new Calculator();

        //when
        int expectedResult = calculator.add(first,second);

        //then
        assertEquals(3,expectedResult);
    }

    @Test
    public void twoPlusTwoShouldEqualsFour() {
        var calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        int first = 6;
        int second = 10;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.subtract(first, second);
        assertEquals(-4,expectedResult);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        int first = 3;
        int second = 3;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.multiply(first,second);
        assertEquals(9,expectedResult);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        double first = 4;
        double second = 2;

        double result = Calculator.divide(first, second);
        assertEquals(2.0, result);
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        double first = 4;
        double second = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(first, second);
        });
    }

}