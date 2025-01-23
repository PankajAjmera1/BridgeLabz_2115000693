import java.util.Scanner;
public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a postive num: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Invalid input: The number must be non-negative.");
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}