import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {
    public static void main(String[] args) throws IOException, CsvException {
        String filePath = "openCSV/src/main/resources/students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();  // Skip header
            String[] line;
            while ((line = reader.readNext()) != null) {
                int marks = Integer.parseInt(line[3]);
                if (marks > 80) {
                    System.out.println("ID: " + line[0] + ", Name: " + line[1] + ", Marks: " + marks);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
