package model;

public class PartTimeStaff extends Laborer implements Wage {
    private int hour;

    public PartTimeStaff() {

    }

    public PartTimeStaff(int hour) {
        this.hour = hour;
    }

    public PartTimeStaff(int age, String address, String email, int phoneNumber, int hour) {
        super(age, address, email, phoneNumber);
        this.hour = hour;
    }

    public PartTimeStaff(int id, String name, int age, String address, String email, int phoneNumber, int hour) {
        super(id, name, age, address, email, phoneNumber);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int getSalaryReceived() {
        return getHour() * 20000;
    }
}
