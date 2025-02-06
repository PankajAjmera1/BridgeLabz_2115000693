import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private ArrayList<Product> products;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.showProducts();
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 400);
        Product product2 = new Product("Headphones", 50);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        Customer customer = new Customer("Krish");
        customer.placeOrder(order);
    }
}
