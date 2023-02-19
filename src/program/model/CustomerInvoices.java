package program.model;

public class CustomerInvoices extends Product {
    private int quantity;
    private Product product;

    public CustomerInvoices() {

    }
    public CustomerInvoices(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public CustomerInvoices(String name, int price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getName() + ", " + getPrice() + ", " + getQuantity();
    }
}
