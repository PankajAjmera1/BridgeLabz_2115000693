import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the unit (F or C): ");
        String unit = input.next();
        double convertedTemperature;
        if (unit.equalsIgnoreCase("F")) {
            convertedTemperature = convertFahrenheitToCelsius(temperature);
        } else if (unit.equalsIgnoreCase("C")) {
            convertedTemperature = convertCelsiusToFahrenheit(temperature);
        } else {
            System.out.println("Invalid unit. Please enter F or C.");
            return;
        }
        System.out.println("Converted temperature: " + convertedTemperature);
    }
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}