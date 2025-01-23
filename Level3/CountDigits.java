import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int digitCount = 0;
        while (number > 0) {
            number /= 10;
            digitCount++;
        }
        System.out.println("The number of digits is "   + digitCount);
    }
}