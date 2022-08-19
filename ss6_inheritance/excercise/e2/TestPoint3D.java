package ss6_inheritance.excercise.e2;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D_1 = new Point3D();
        Point3D point3D_2 = new Point3D(3, 4, 5);
        System.out.println(point3D_1.toString() + "\n" + point3D_2.toString());
        System.out.println("=========================");
        point3D_1.setX(1);
        point3D_1.setY(2);
        point3D_1.setZ(3);
        point3D_2.setXY(3.3f, 4.1f);
        System.out.println(point3D_1.toString() + " \n" + point3D_2.toString());
        System.out.println("=========================");
        point3D_2.setXYZ(3.3f, 4.1f, 5.1f);
        System.out.println(point3D_2.toString());
    }
}
