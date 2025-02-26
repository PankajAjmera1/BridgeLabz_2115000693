import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CSVtoJSON {
    public static void main(String[] args) throws Exception {
        String csvFile = "json/src/main/resources/csvdata.csv";
        String jsonFile = "json/src/main/resources/jsondata.json";

        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String headerLine = br.readLine();
        String[] headers = headerLine.split(",");

        ObjectMapper objectMapper = new ObjectMapper();
        ArrayNode jsonArray = objectMapper.createArrayNode();

        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            ObjectNode jsonObject = objectMapper.createObjectNode();

            for (int i = 0; i < headers.length; i++) {
                jsonObject.put(headers[i], values[i]);
            }
            jsonArray.add(jsonObject);
        }
        br.close();

        FileWriter file = new FileWriter(jsonFile);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, jsonArray);
        file.close();

        System.out.println("CSV converted to JSON successfully!");
    }
}
