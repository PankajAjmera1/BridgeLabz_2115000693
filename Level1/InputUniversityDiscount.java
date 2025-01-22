import java.util.Scanner;

public class InputUniversityDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total fee: ");
        double fee = scanner.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discountPercent = scanner.nextDouble();
        
        double discount = fee * (discountPercent / 100);
        double finalFee = fee - discount;
        
        System.out.printf("The discount amount is INR %.0f and final discounted fee is INR %.0f", discount, finalFee);
        
        scanner.close();
    }
}