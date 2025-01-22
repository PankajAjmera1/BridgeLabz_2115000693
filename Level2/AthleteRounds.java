import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first side of triangle (meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter second side of triangle (meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter third side of triangle (meters): ");
        double side3 = scanner.nextDouble();
        
        double perimeter = side1 + side2 + side3;
        
        int rounds = (int) Math.ceil(5000 / perimeter);
        
        System.out.printf("The total number of rounds the athlete will run is %d to complete 5 km", rounds);
        
        scanner.close();
    }
}