import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.printf("The %f celsius is %f fahrenheit", celsius, fahrenheit);
        
        scanner.close();
    }
}