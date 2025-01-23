import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("The number " + num + " is an Armstrong number.");
        } else {
            System.out.println("The number " + num + " is not an Armstrong number.");
        }
    }
}