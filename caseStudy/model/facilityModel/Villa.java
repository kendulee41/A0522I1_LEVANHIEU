package caseStudy.model.facilityModel;

public class Villa extends Facility{
    private byte standard;
    private double areaPool;
    private byte numberFloor;

    public Villa(String name, double area, int cost, int amountPeople, String type, byte standard, double areaPool, byte numberFloor) {
        super(name, area, cost, amountPeople, type);
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa() {
    }

    public byte getStandard() {
        return standard;
    }

    public void setStandard(byte standard) {
        this.standard = standard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public byte getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(byte numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard=" + standard +
                ", areaPool=" + areaPool +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
