package caseStudy.model.personModel;

public class Customer extends Person{
    private String type;
    private String address;

    public Customer(int code, String fullName, String dayOfBirth, String gender, String ID, String phoneNumber, String email) {
        super(code, fullName, dayOfBirth, gender, ID, phoneNumber, email);
    }

    public Customer() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
