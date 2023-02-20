package program.model;

public class CustomerInvoices extends Product implements Wage {
    private int quantity;

    public CustomerInvoices() {

    }
    public CustomerInvoices(int quantity) {
        this.quantity = quantity;
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

    @Override
    public int getMoney() {
        return getPrice() * getQuantity();
    }
}
