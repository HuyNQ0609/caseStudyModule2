package program.model;

public class Customer extends Laborer {
    public Customer() {

    }

    public Customer(int age, String address, String email, int phoneNumber) {
        super(age, address, email, phoneNumber);
    }

    public Customer(int id, String name, int age, String address, String email, int phoneNumber) {
        super(id, name, age, address, email, phoneNumber);
    }
}
