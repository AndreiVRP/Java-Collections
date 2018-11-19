public class Product {
    private final String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() {
        return "The product is named " + this.name + ", and it costs $" + this.price;
    }
}