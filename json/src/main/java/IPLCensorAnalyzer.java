import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.List;

public class IPLCensorAnalyzer {
    public static void main(String[] args) throws Exception {
        // Process JSON
        processJSON("json/src/main/resources/ipl.json", "json/src/main/resources/censored_ipl_censored.json");

        // Process CSV
        processCSV("json/src/main/resources/ipl_matches.csv", "json/src/main/resources/censored_ipl_matches.csv");

        System.out.println("Censored files generated successfully!");
    }

    // Method to process JSON file
    public static void processJSON(String inputFile, String outputFile) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayNode matches = (ArrayNode) objectMapper.readTree(new File(inputFile));

        for (JsonNode match : matches) {
            ((ObjectNode) match).put("team1", censorTeam(match.get("team1").asText()));
            ((ObjectNode) match).put("team2", censorTeam(match.get("team2").asText()));
            ((ObjectNode) match).put("player_of_match", "REDACTED");
        }

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), matches);
    }

    // Method to process CSV file
    public static void processCSV(String inputFile, String outputFile) throws Exception {
        try (CSVReader reader = new CSVReader(new FileReader(inputFile));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {

            List<String[]> data = reader.readAll();
            for (int i = 1; i < data.size(); i++) { // Skipping header
                data.get(i)[1] = censorTeam(data.get(i)[1]); // Censor team1
                data.get(i)[2] = censorTeam(data.get(i)[2]); // Censor team2
                data.get(i)[3] = "REDACTED"; // Censor Player of Match
            }
            writer.writeAll(data);
        }
    }

    // Method to censor team names
    private static String censorTeam(String teamName) {
        return teamName.replaceAll(" (?!$).*", " ***");
    }
}
