import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        boolean isNum1Largest = (num1 > num2) && (num1 > num3);
        boolean isNum2Largest = (num2 > num1) && (num2 > num3);
        boolean isNum3Largest = (num3 > num1) && (num3 > num2);
        System.out.println("Is the first number the largest? " + isNum1Largest);
        System.out.println("Is the second number the largest? " + isNum2Largest);
        System.out.println("Is the third number the largest? " + isNum3Largest);
    }
}