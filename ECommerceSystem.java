abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    private double taxRate = 0.18; // 18% tax for electronics

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount for electronics
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax (" + (taxRate * 100) + "%)";
    }
}

class Clothing extends Product implements Taxable {
    private double taxRate = 0.05; // 5% tax for clothing

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount for clothing
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (" + (taxRate * 100) + "%)";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0; // No discount for groceries
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics(1, "Laptop - MS Dhoni Edition", 1000);
        products[1] = new Clothing(2, "Shirt - Virat Kohli Collection", 50);
        products[2] = new Groceries(3, "Energy Bar - ABD Endorsed", 10);

        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Base Price: $" + product.getPrice());
            System.out.println("Discount: $" + discount);
            if (product instanceof Taxable) {
                System.out.println("Tax: $" + tax + " (" + ((Taxable) product).getTaxDetails() + ")");
            } else {
                System.out.println("Tax: $0 (No Tax Applied)");
            }
            System.out.println("Final Price: $" + finalPrice);
            System.out.println("--------------------------------");
        }
    }
}
