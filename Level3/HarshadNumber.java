import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sumOfDigits = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            temp /= 10;
        }
        if (number % sumOfDigits == 0) {
            System.out.println("The number " + number + " is a Harshad Number.");
        } else {
            System.out.println("The number " + number + " is not a Harshad Number.");
        }
    }
}