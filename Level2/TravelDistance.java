import java.util.Scanner;

public class TravelDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter from city: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter via city: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter to city: ");
        String toCity = scanner.nextLine();
        
        System.out.print("Enter distance from to via (miles): ");
        double fromToVia = scanner.nextDouble();
        
        System.out.print("Enter distance via to final city (miles): ");
        double viaToFinalCity = scanner.nextDouble();
        
        System.out.print("Enter time taken: ");
        double timeTaken = scanner.nextDouble();
        
        double totalDistance = fromToVia + viaToFinalCity;
        
        System.out.printf("%s's journey from %s via %s to %s covers %.2f miles in %.2f hours", 
                           name, fromCity, viaCity, toCity, totalDistance, timeTaken);
        
        scanner.close();
    }
}