import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ValidateJSON {
    public static void main(String[] args) {
        String filePath = "json/src/main/resources/ipl.json"; // Change to your file path
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.readTree(new File(filePath));
            System.out.println(" Valid JSON: " + filePath);
        } catch (IOException e) {
            System.out.println(" Invalid JSON: " + filePath);
            e.printStackTrace();
        }
    }
}
