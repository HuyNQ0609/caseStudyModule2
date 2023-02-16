package program.model;

public class PartTimeStaff extends Personal implements Comparable<PartTimeStaff> {
    private int hour;

    public PartTimeStaff() {

    }

    public PartTimeStaff(int hour) {
        this.hour = hour;
    }

    public PartTimeStaff(int id, int age, String address, String email, int phoneNumber, int hour) {
        super(id, age, address, email, phoneNumber);
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

    @Override
    public String toString() {
        return  getId() + ", " + getName() + ", " + getAge() + ", " + getAddress() + ", " +
                getEmail() + ", " + getPhoneNumber() + ", " + getHour();
    }

    @Override
    public int compareTo(PartTimeStaff o) {
        return getHour() - o.getHour();
    }
}
