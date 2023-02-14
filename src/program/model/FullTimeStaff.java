package program.model;

public class FullTimeStaff extends Personal implements Wage {
    private int hardSalary;
    private int reward;
    private int mulct;

    public FullTimeStaff() {

    }

    public FullTimeStaff(int hardSalary, int reward, int mulct) {
        this.hardSalary = hardSalary;
        this.reward = reward;
        this.mulct = mulct;
    }

    public FullTimeStaff(int id, int age, String address, String email, int phoneNumber, int hardSalary, int reward, int mulct) {
        super(id, age, address, email, phoneNumber);
        this.hardSalary = hardSalary;
        this.reward = reward;
        this.mulct = mulct;
    }

    public FullTimeStaff(int id, String name, int age, String address, String email, int phoneNumber, int hardSalary, int reward, int mulct) {
        super(id, name, age, address, email, phoneNumber);
        this.hardSalary = hardSalary;
        this.reward = reward;
        this.mulct = mulct;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getMulct() {
        return mulct;
    }

    public void setMulct(int mulct) {
        this.mulct = mulct;
    }

    @Override
    public int getSalaryReceived() {
        return getHardSalary() + getReward() - getMulct();
    }

    @Override
    public String toString() {
        return  getId() + ", " + getName() + ", " + getAge() + ", " + getAddress() + ", " +
                getEmail() + ", " + getPhoneNumber() + ", " + getHardSalary() + ", " +
                getReward() + ", " + getMulct();
    }
}
