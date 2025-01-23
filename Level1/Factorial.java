import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Invalid input: please enter a positive integer.");
            return;
        }
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}