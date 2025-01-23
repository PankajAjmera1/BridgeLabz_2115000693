import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        System.out.println("The result of " + number + " raised to the power " + power + " is " + result);
    }
}