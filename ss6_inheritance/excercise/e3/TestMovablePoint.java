package ss6_inheritance.excercise.e3;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint();
        MovablePoint movablePoint2 = new MovablePoint(2.2f,3.1f);
        MovablePoint movablePoint3 = new MovablePoint(1.0f,2.0f,4.0f,5.5f);
        System.out.println(movablePoint1+"\n"+movablePoint2+"\n"+movablePoint3);
        System.out.println("====================");
        movablePoint1.setXY(2.0f,3.0f);
        movablePoint1.setSpeed(4.0f,5.0f);
        System.out.println(movablePoint1+"\nMove: "+movablePoint1.move());
    }
}
