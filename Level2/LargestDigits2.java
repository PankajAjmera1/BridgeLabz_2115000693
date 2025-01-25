import java.util.Scanner;
public class LargestDigits2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = new int[10];
        int largestDigit = 0;
        int secondLargestDigit = 0;
        int index = 0;
        while (number > 0) {
            digits[index] = number % 10;
            if (digits[index] > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digits[index];
            } else if (digits[index] > secondLargestDigit && digits[index] != largestDigit) {
                secondLargestDigit = digits[index];
            }
            index++;
            if (index >= digits.length) {
                digits = increaseArraySize(digits, 10);
            }
            number /= 10;
        }
        System.out.println("The largest digit is " + largestDigit);
        System.out.println("The second-largest digit is " + secondLargestDigit);
    }
    public static int[] increaseArraySize(int[] array, int amount) {
        int[] newArray = new int[array.length + amount];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}