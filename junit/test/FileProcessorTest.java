package test;
import src.FileProcessor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class FileProcessorTest {
    FileProcessor processor = new FileProcessor();
    String filename = "testfile.txt";

    @Test
    public void testWriteAndReadFile() throws IOException {
        processor.writeToFile(filename, "Hello, World!");
        assertEquals("Hello, World!", processor.readFromFile(filename));
    }

    @Test
    public void testFileExists() throws IOException {
        processor.writeToFile(filename, "Test Content");
        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    public void testIOException() {
        assertThrows(IOException.class, () -> processor.readFromFile("nonexistent.txt"));
    }
}
