package program.model;

public abstract class Personal extends Name implements Wage {
    private int id;
    private int age;
    private String address;
    private String email;
    private int phoneNumber;

    public Personal() {
    }

    public Personal(int id, int age, String address, String email, int phoneNumber) {
        this.id = id;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Personal(int id, String name, int age, String address, String email, int phoneNumber) {
        super(name);
        this.id = id;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
