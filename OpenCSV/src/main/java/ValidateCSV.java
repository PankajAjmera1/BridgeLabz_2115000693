import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws IOException, CsvException {
        String filePath = "openCSV/src/main/resources/contacts.csv";
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext(); // Skip header
            String[] row;
            while ((row = reader.readNext()) != null) {
                boolean emailValid = emailPattern.matcher(row[2]).matches();
                boolean phoneValid = phonePattern.matcher(row[3]).matches();

                if (!emailValid || !phoneValid) {
                    System.out.println("Invalid record: " + String.join(", ", row));
                }
            }
        }
    }
}
