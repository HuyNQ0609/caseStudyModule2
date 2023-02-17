package program.model;

public class Product extends Name implements Comparable<Product> {
    private int price;

    public Product() {
    }

    public Product(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
