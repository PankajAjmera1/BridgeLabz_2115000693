import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) throws IOException , CsvException {
        String filePath = "openCSV/src/main/resources/employees.csv";
        int count = 0;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();  // Skip header row
            while (reader.readNext() != null) {
                count++;
            }
            System.out.println("Total records (excluding header): " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
