import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJSONFields {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("json/src/main/resources/data.json"));

        System.out.println("Name: " + rootNode.get("name").asText());
        System.out.println("Email: " + rootNode.get("email").asText());
    }
}
