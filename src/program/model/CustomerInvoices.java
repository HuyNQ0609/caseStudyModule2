package program.model;

public class CustomerInvoices extends Product {
    private int quantity;

    public CustomerInvoices() {

    }
    public CustomerInvoices(String name, int price) {
        super(name, price);
    }
    public CustomerInvoices(String name, int price, int quantity) {
        super(name, price);
        this.quantity = quantity;
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
