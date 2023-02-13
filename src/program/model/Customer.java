package program.model;

public class Customer extends Laborer {
    private int basicSalary;

    public Customer() {

    }

    public Customer(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Customer(int age, String address, String email, int phoneNumber, int basicSalary) {
        super(age, address, email, phoneNumber);
        this.basicSalary = basicSalary;
    }

    public Customer(int id, String name, int age, String address, String email, int phoneNumber, int basicSalary) {
        super(id, name, age, address, email, phoneNumber);
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
}
