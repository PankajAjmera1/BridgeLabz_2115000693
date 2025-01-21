import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        int kilometers = scanner.nextInt();
        double miles = kilometers * 0.621371;
        System.out.printf("Results in miles: "+miles);
}
}
