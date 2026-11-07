//practical 8
class Product {
    String productName;
    double price;
    int quantity;
    public Product() {
        this.productName = "Unknown Product";
        this.price = 0.0;
        this.quantity = 0;
    }
    public Product(String productName) {
        this.productName = productName;
        this.price = 0.0;
        this.quantity = 0;
    }
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.quantity = 1; 
    }
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateTotalCost() {
        return price * quantity;
    }
    public void displayDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : $" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Cost   : $" + calculateTotalCost());
        System.out.println("-----------------------------------");
    }
}
public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println("--- 1. No-Argument Constructor ---");
        product1.displayDetails();
        Product product2 = new Product("Desk Chair");
        System.out.println("--- 2. Product Name Only Constructor ---");
        product2.displayDetails();
        Product product3 = new Product("Mechanical Keyboard", 89.99);
        System.out.println("--- 3. Product Name and Price Constructor ---");
        product3.displayDetails();
        Product product4 = new Product("Notebook", 3.50, 10);
        System.out.println("--- 4. All Three Fields Constructor ---");
        product4.displayDetails();
    }
}