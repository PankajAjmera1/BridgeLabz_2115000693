package test;
import src.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {

    @Test
    public void testValidDateFormat() throws ParseException {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
    }

    @Test
    public void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("12/25/2023"));
    }
}
