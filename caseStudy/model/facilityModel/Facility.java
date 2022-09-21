package caseStudy.model.facilityModel;

public abstract class Facility {
        private String name;
        private double area;
        private int cost;
        private int amountPeople;
        private String type;

    public Facility(String name, double area, int cost, int amountPeople, String type) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.amountPeople = amountPeople;
        this.type = type;
    }

    public Facility() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", amountPeople=" + amountPeople +
                ", type='" + type + '\'' +
                '}';
    }
}
