package program.model;

public class Product extends Overview implements Comparable<Product> {
    private int price;

    public Product() {
    }

    public Product(int price) {
        this.price = price;
    }

    public Product(int id, String name, int price) {
        super(id, name);
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
        return getId() + ", " + getName() + ", " + getPrice();
    }

    @Override
    public int compareTo(Product newProduct) {
        return getPrice() - newProduct.getPrice();
    }
}
