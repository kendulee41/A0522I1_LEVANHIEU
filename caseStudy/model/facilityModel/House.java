package caseStudy.model.facilityModel;

public class House extends Facility{
    private byte standard;
    private byte numberFloor;

    public House(String name, double area, int cost, int amountPeople, String type, byte standard, byte numberFloor) {
        super(name, area, cost, amountPeople, type);
        this.standard = standard;
        this.numberFloor = numberFloor;
    }

    public House() {
    }

    public byte getStandard() {
        return standard;
    }

    public void setStandard(byte standard) {
        this.standard = standard;
    }

    public byte getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(byte numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standard=" + standard +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
