import com.opencsv.*;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.*;

public class UpdateCSV {
    public static void main(String[] args) throws IOException , CsvException {
        String inputFile = "openCSV/src/main/resources/employees.csv";
        String outputFile = "openCSV/src/main/resources/updated_employees.csv";

        try (CSVReader reader = new CSVReader(new FileReader(inputFile));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {

            List<String[]> allData = reader.readAll();
            allData.get(0)[3] = "Updated Salary";  // Change header

            for (int i = 1; i < allData.size(); i++) {
                if (allData.get(i)[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(allData.get(i)[3]) * 1.10;
                    allData.get(i)[3] = String.valueOf(salary);
                }
            }

            writer.writeAll(allData);
            System.out.println("Updated salaries saved to a new file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
