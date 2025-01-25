import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = new int[10];
        int index = 0;
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        System.out.print("The reversed number is: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}