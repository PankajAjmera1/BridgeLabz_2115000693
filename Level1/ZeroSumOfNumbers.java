import java.util.Scanner;
public class ZeroSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.println("Enter a number (0 to quit): ");
        number = scanner.nextDouble();
        while (number != 0) {
            total += number;
            System.out.println("Enter a number (0 to quit): ");
            number = scanner.nextDouble();
        }
        System.out.println("The sum of the numbers is: " + total);
    }
}