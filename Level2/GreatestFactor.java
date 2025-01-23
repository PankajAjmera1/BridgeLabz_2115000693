import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int greatestFactor = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                if (i > greatestFactor) {
                    greatestFactor = i;
                }
            }
        }
        if (greatestFactor == 0) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The greatest factor of " + number + " is " + greatestFactor);
        }
    }
}