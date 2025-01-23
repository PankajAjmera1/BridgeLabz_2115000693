import java.util.Scanner;
public class NegativeSumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter no. (0 or negative number to quit): ");
            number = input.nextInt();
            if (number <= 0) {
                break;
            }
            sum += number;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}