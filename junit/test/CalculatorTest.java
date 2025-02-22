package test;
import org.junit.jupiter.api.Test;

import src.Calculator;

import static org.junit.jupiter.api.Assertions.*;




public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
