package Product;

public class Product {
    // Attributes of Product
    String name;
    double price;

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
    }

    public void displayCategory() {
        System.out.println("Category: General Product");
    }
}
