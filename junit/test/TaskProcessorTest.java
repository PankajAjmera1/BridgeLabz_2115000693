package test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import src.TaskProcessor;

public class TaskProcessorTest {
    TaskProcessor processor = new TaskProcessor();

    @Test
    @Timeout(2)
    public void testLongRunningTask() throws InterruptedException {
        processor.longRunningTask();
    }
}
