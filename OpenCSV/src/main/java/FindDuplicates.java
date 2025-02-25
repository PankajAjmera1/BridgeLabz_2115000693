import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) throws Exception {
        Set<String> ids = new HashSet<>();
        List<String[]> duplicates = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader("openCSV/src/main/resources/students.csv"))) {
            reader.readNext();
            String[] row;
            while ((row = reader.readNext()) != null) {
                if (!ids.add(row[0])) {
                    duplicates.add(row);
                }
            }
        }

        System.out.println("Duplicate Records:");
        for (String[] d : duplicates) {
            System.out.println(Arrays.toString(d));
        }
    }
}
