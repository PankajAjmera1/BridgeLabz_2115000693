import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

public class JSONtoXML {
    public static void main(String[] args) {
        String jsonFilePath = "json/src/main/resources/student.json"; // Change this to your JSON file path

        try {
            // Read JSON file
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode node = objectMapper.readTree(new File(jsonFilePath));

            // Convert JSON to XML
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(node);

            // Print the XML output
            System.out.println(xml);
        } catch (IOException e) {
            System.out.println("Error: Unable to read or convert JSON file.");
            e.printStackTrace();
        }
    }
}
