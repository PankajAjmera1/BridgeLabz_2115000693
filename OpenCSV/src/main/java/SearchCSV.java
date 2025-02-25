import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;

public class SearchCSV {
    public static void main(String[] args) throws  IOException, CsvException
    {
        String filePath = "openCSV/src/main/resources/employees.csv";
        String searchName = "Bob";  // Name to search

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();  // Skip header
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + line[2] + ", Salary: " + line[3]);
                    return;
                }
            }
            System.out.println("Employee not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
