package ss4_class_object.excercise.e3;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
