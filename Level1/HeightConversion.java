import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter height in centimeters: ");
        double heightCm = scanner.nextDouble();
        
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) (totalInches % 12);
        
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %d", 
                           heightCm, feet, inches);
        
        scanner.close();
    }
}