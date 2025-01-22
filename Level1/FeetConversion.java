import java.util.Scanner;

public class FeetConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        
        System.out.printf("Distance in yards is %.2f and in miles is %.2f", yards, miles);
        
        scanner.close();
    }
}