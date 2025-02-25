import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) throws IOException , CsvException {
        String filePath = "openCSV/src/main/resources/students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("ID: " + line[0] + ", Name: " + line[1] + ", Age: " + line[2] + ", Marks: " + line[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}