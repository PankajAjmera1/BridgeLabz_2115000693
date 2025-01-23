import java.util.Scanner;
class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. The number must be a positive integer.");
            return;
        }
        int sumUsingFormula = n * (n + 1) / 2;
        int sumUsingWhileLoop = 0;
        int i = 1;
        while (i <= n) {
            sumUsingWhileLoop += i;
            i++;
        }
        if (sumUsingFormula == sumUsingWhileLoop) {
            System.out.println("The result from both computations is correct.");
        } else {
            System.out.println("The result from both computations is not correct.");
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sumUsingFormula);
    }
}