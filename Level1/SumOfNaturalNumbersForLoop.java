import java.util.Scanner;
public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. The number must be a positive integer.");
            return;
        }
        int sumUsingFormula = (number * (number + 1)) / 2;
        int sumUsingForLoop = 0;
        for (int i = 1; i <= number; i++) {
            sumUsingForLoop += i;
        }
        if (sumUsingFormula == sumUsingForLoop) {
            System.out.println("The sum of natural numbers from 1 to " + number + " is " + sumUsingFormula);
        } else {
            System.out.println("There is an error in the calculation.");
        }
    }
}