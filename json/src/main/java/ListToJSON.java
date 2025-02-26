import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class ListToJSON {
    public static void main(String[] args) throws Exception {
        List<Car> cars = Arrays.asList(new Car("Toyota", "Camry", 2020), new Car("Honda", "Civic", 2022));
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(cars);
        System.out.println(json);
    }
}
