import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortCSVBySalary {
    public static void main(String[] args) throws IOException, CsvException {
        String filePath = "openCSV/src/main/resources/employees.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            records.remove(0); // Remove header

            records.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

            System.out.println("Top 5 highest-paid employees:");
            records.stream().limit(5).forEach(r -> System.out.println(Arrays.toString(r)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
