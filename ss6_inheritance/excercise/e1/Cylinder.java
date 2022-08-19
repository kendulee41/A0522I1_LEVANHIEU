package ss6_inheritance.excercise.e1;

public class Cylinder extends Circle {
    public double height = 2.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getVolume() {
        return this.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color=" + color +
                ", volume="+ getVolume() + '}';
    }
}
