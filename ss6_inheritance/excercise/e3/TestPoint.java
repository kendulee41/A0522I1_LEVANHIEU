package ss6_inheritance.excercise.e3;

import ss6_inheritance.excercise.e2.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(3, 4);
        System.out.println(point1.toString() + " \n " + point2.toString());
        System.out.println("=========================");
        point1.setX(1);
        point1.setY(2);
        point2.setXY(3.3f, 4.1f);
        System.out.println(point1.toString() + "\n" + point2.toString());
    }
}
