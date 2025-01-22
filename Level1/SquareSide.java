import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter perimeter: ");
        double perimeter = scanner.nextDouble();
        
        double side = perimeter / 4;
        
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", side, perimeter);
        
        scanner.close();
    }
}