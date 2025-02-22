package test;
import src.ExceptionHandler;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionHandlerTest {
    ExceptionHandler handler = new ExceptionHandler();

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> handler.divide(10, 0));
    }
}

