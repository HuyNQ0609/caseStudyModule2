package model;

public class Manager extends Laborer implements Wage {
    private int basicSalary;

    public Manager() {

    }

    public Manager(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Manager(int age, String address, String email, int phoneNumber, int basicSalary) {
        super(age, address, email, phoneNumber);
        this.basicSalary = basicSalary;
    }

    public Manager(int id, String name, int age, String address, String email, int phoneNumber, int basicSalary) {
        super(id, name, age, address, email, phoneNumber);
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public int getSalaryReceived() {
        return 0;
    }
}
