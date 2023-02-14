package program.model;

import java.util.List;

public class Customer extends Personal {
    private List<Product> products;
    public Customer() {

    }
    public Customer(List<Product> products) {
        this.products = products;
    }

    public Customer(int id, int age, String address, String email, int phoneNumber, List<Product> products) {
        super(id, age, address, email, phoneNumber);
        this.products = products;
    }

    public Customer(int id, String name, int age, String address, String email,
                    int phoneNumber, List<Product> products) {
        super(id, name, age, address, email, phoneNumber);
        this.products = products;
    }
}
