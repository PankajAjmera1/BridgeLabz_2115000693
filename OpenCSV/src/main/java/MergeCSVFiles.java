import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class MergeCSVFiles {
    public static void main(String[] args) throws Exception {
        Map<String, String[]> studentData = new HashMap<>();

        try (CSVReader reader1 = new CSVReader(new FileReader("openCSV/src/main/resources/students1.csv"));
             CSVReader reader2 = new CSVReader(new FileReader("openCSV/src/main/resources/students2.csv"));
             CSVWriter writer = new CSVWriter(new FileWriter("openCSV/src/main/resources/merged_students.csv"))) {

            reader1.readNext();
            String[] row;
            while ((row = reader1.readNext()) != null) {
                studentData.put(row[0], row);
            }

            reader2.readNext();
            while ((row = reader2.readNext()) != null) {
                if (studentData.containsKey(row[0])) {
                    String[] merged = {row[0], studentData.get(row[0])[1], studentData.get(row[0])[2], row[1], row[2]};
                    writer.writeNext(merged);
                }
            }
        }
    }
}
