import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.File;
import java.io.FileReader;

public class ValidateEmailJSON {
    public static void main(String[] args) {
        try {
            // Read JSON from file
            File file = new File("src/main/resources/emaildata.json");
            JSONObject json = new JSONObject(new JSONTokener(new FileReader(file)));

            // Define JSON Schema
            String schemaString = "{ \"type\": \"object\", \"properties\": { \"email\": { \"type\": \"string\", \"format\": \"email\" } }, \"required\": [\"email\"] }";
            JSONObject schemaJson = new JSONObject(schemaString);
            Schema schema = SchemaLoader.load(schemaJson);

            // Validate JSON
            schema.validate(json);
            System.out.println("Valid JSON ");
        } catch (Exception e) {
            System.out.println("Invalid JSON : " + e.getMessage());
        }
    }
}
