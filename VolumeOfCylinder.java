import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        int radius = scanner.nextInt();
        System.out.print("Enter the height of cylinder: ");
        int height = scanner.nextInt();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("volume of the cylinder is:"+ volume);
}
}
