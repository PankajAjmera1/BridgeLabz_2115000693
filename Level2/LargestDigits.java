import java.util.Scanner;
public class LargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = new int[10];
        int i = 0;
        while (number > 0) {
            digits[i] = number % 10;
            number /= 10;
            i++;
        }
        int largestDigit = 0;
        int secondLargestDigit = 0;
        for (int digit : digits) {
            if (digit > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digit;
            } else if (digit > secondLargestDigit && digit != largestDigit) {
                secondLargestDigit = digit;
            }
        }
        System.out.println("The largest digit is " + largestDigit + " and the second-largest digit is " + secondLargestDigit);
    }
}