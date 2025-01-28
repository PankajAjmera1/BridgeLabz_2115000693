import java.util.Scanner;

public class AthleteRoundsCalculator {

    // Method to calculate rounds
    public static double computeRounds(double side1, double side2, double side3) {
      
        double perimeter = side1 + side2 + side3;
        
        double totalDistance = 5000; // 5
        
        return totalDistance / perimeter;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input triangle sides
        System.out.print("Enter first side length (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter second side length (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter third side length (in meters): ");
        double side3 = scanner.nextDouble();
        
        // Calculate rounds
        double rounds = computeRounds(side1, side2, side3);
        
        System.out.printf("Number of rounds to complete 5 km: %.2f\n", rounds);
        
        scanner.close();
    }
}