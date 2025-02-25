import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String filePath = "openCSV/src/main/resources/employees1.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = { "ID", "Name", "Department", "Salary" };
            writer.writeNext(header);

            String[][] data = {
                    {"101", "Pankaj", "HR", "50000"},
                    {"102", "Ajmera", "IT", "60000"},
                    {"103", "Charlie", "Finance", "55000"},
                    {"104", "David", "IT", "65000"},
                    {"105", "Eve", "Marketing", "48000"},
                    {"106", "Frank", "HR", "52000"},
                    {"107", "Grace", "IT", "61000"},
                    {"108", "Hank", "Finance", "54000"},
                    {"109", "Ivy", "Marketing", "47000"}
            };

            for (String[] row : data) {
                writer.writeNext(row);
            }
            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
