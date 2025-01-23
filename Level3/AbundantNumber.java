import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum > number) {
            System.out.println("The number " + number + " is an Abundant Number.");
        } else {
            System.out.println("The number " + number + " is not an Abundant Number.");
        }
    }
}