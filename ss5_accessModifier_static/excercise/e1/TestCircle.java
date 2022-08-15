package ss5_accessModifier_static.excercise.e1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("radius: "+circle.getRadius());
        System.out.println("Area: "+circle.getArea());
    }
}
