import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int celsius = scanner.nextInt();
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "C is equal to " + fahrenheit + "F");
}
}
