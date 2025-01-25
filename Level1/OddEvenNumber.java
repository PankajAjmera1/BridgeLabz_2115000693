import java.util.Scanner;
public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] oddNumbers = new int[number / 2];
        int[] evenNumbers = new int[number / 2];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            } else {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            }
        }
        System.out.println("Odd numbers: ");
        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " ");
        }
        System.out.println("Even numbers: ");
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
    }
}