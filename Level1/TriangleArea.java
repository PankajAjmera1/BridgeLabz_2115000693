import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        
        double areaSquareInches = 0.5 * base * height;
        double areaSquareCm = areaSquareInches * 6.4516;
        
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters", 
                           areaSquareInches, areaSquareCm);
        
        scanner.close();
    }
}