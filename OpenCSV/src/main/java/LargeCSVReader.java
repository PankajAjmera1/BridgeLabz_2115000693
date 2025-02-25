import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;

public class LargeCSVReader {
    public static void main(String[] args) throws IOException , CsvException {
        String filePath = "openCSV/src/main/resources/large_students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] row;
            int count = 0;
            while ((row = reader.readNext()) != null) {
                count++;
                if (count % 100 == 0) {
                    System.out.println("Processed: " + count + " records");
                }
            }
        }
    }
}
