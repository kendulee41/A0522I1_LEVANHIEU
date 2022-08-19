package ss6_inheritance.excercise.e2;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D_1 = new Point2D();
        Point2D point2D_2 = new Point2D(3, 4);
        System.out.println(point2D_1.toString() + " \n" + point2D_2.toString());
        System.out.println("=========================");
        point2D_1.setX(1);
        point2D_1.setY(2);
        point2D_2.setXY(3.3f, 4.1f);
        System.out.println(point2D_1.toString() + "\n" + point2D_2.toString());
    }
}
