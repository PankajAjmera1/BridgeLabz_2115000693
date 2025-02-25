import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.util.List;

public class CSVToJavaObjects {
    public static void main(String[] args) throws Exception {
        List<Student> students = new CsvToBeanBuilder<Student>(
                new FileReader("openCSV/src/main/resources/students.csv"))
                .withType(Student.class).build().parse();

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
