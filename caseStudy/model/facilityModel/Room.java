package caseStudy.model.facilityModel;

public class Room extends Facility{
    private String freeService;

    public Room(String name, double area, int cost, int amountPeople, String type) {
        super(name, area, cost, amountPeople, type);
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
