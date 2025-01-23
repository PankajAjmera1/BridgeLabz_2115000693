import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("The year must be >= 1582.");
        } else if (year % 4 != 0) {
            System.out.println("The year " + year + " is not a Leap Year.");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The year " + year + " is a Leap Year.");
        }
    }
}