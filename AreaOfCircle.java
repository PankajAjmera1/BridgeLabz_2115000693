import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle with radius is:"+ area);
}
}
