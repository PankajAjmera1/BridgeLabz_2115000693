import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.printf("The sum of %d natural numbers is %d", number, sum);
        } else {
            System.out.printf("The number %d is not a natural number", number);
        }
        
        scanner.close();
    }
}