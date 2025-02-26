import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.sql.*;
import java.io.File;
import java.io.FileWriter;

public class SQLiteToJSON {
    public static void main(String[] args) {
        String dbUrl = "jdbc:sqlite:json/src/main/resources/users.db";
        String outputPath = "json/src/main/resources/users_report.json";

        try (Connection conn = DriverManager.getConnection(dbUrl);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, email FROM users")) { // Removed 'age'

            ObjectMapper objectMapper = new ObjectMapper();
            ArrayNode jsonArray = objectMapper.createArrayNode();

            while (rs.next()) {
                ObjectNode jsonObject = objectMapper.createObjectNode();
                jsonObject.put("id", rs.getInt("id"));
                jsonObject.put("name", rs.getString("name"));
                jsonObject.put("email", rs.getString("email"));
                jsonArray.add(jsonObject);
            }

            // Ensure the output directory exists
            File file = new File(outputPath);
            file.getParentFile().mkdirs(); // Create directories if they don't exist

            try (FileWriter writer = new FileWriter(file)) {
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(writer, jsonArray);
            }

            System.out.println("✅ JSON report generated successfully at: " + outputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}