package program.model;

import java.util.List;

public class Customer extends Personal {
    private List<Product> products;
    public Customer() {

    }
    public Customer(List<Product> products) {
        this.products = products;
    }

    public Customer(String name, int age, String address, String email, String phoneNumber) {
        super(name, age, address, email, phoneNumber);
    }

    public Customer(String id, int age, String address, String email,
                                String phoneNumber, List<Product> products) {
        super(id, age, address, email, phoneNumber);
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public int getMoney() {
        int totalMoney = 0;
        for (Product product : products) {
            totalMoney += (product.getPrice() * product.getQuantity());
        }
        return totalMoney;
    }

    @Override
    public String toString() {
        return getName() + ", " + getAge() + ", " + getEmail() + ", " +
                    getAddress() + ", " + getPhoneNumber();
    }
}
