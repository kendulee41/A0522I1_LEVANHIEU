package caseStudy.model.personModel;

public class Employee extends Person{
    private String level;
    private String position;
    private byte wage;

    public Employee(int code, String fullName, String dayOfBirth, String gender, String ID, String phoneNumber, String email) {
        super(code, fullName, dayOfBirth, gender, ID, phoneNumber, email);
    }

    public Employee() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public byte getWage() {
        return wage;
    }

    public void setWage(byte wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
}
