package program.model;

public class Product extends Name implements Comparable<Product> {
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, int price, int quantity) {
        super(name);
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getName() + ", " + getPrice();
    }

    @Override
    public int compareTo(Product newProduct) {
        return getPrice() - newProduct.getPrice();
    }
}
