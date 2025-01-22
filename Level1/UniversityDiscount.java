public class UniversityDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        
        double discount = fee * (discountPercent / 100);
        double finalFee = fee - discount;
        
        System.out.printf("The discount amount is INR %.0f and final discounted fee is INR %.0f", discount, finalFee);
    }
}