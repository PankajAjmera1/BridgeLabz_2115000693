class Product {
    private static double discount = 25;
    private final String productID;
    private double price;
    private int quantity;
    private String productName;

    public Product(String productName, String productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("\nProduct Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Original Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Discounted Price: " + getDiscountedPrice());
        }
    }
}

public class ProductCartSystem {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop A Series", "A44", 150, 2);
        Product product2 = new Product("Smartphone", "A55", 100, 5);

        System.out.println("Before Updating Discount:");
        product1.displayDetails();
        product2.displayDetails();

        Product.updateDiscount(15);

        System.out.println("\nAfter Updating Discount:");
        product1.displayDetails();
        product2.displayDetails();
    }
}
