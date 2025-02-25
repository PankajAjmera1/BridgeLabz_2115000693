import com.fasterxml.jackson.databind.*;
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class JSONToCSV {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, String>> students = mapper.readValue(new File("openCSV/src/main/resources/student.json"), List.class);

        try (CSVWriter writer = new CSVWriter(new FileWriter("openCSV/src/main/resources/students_json.csv"))) {
            writer.writeNext(students.get(0).keySet().toArray(new String[0]));
            for (Map<String, String> s : students) {
                writer.writeNext(s.values().toArray(new String[0]));
            }
        }
    }
}
