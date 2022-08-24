package ss7_abstract_interface.excercise.e1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Rectangle(2,3);
        arr[1] = new Circle(1.5);
        arr[2] = new Square(2.5);
        int i=1;
        for (Shape s : arr){
            System.out.println("Shape "+i+":\n\tArea: "+s.getArea());
            i++;
        }
        Random r = new Random();
        int random;
        for (Shape s : arr){
            random = r.nextInt(100)+1;
            s.resize(random);
        }
        i=1;
        System.out.println("=======================");
        System.out.println("Shape resize:");
        for (Shape s : arr){
            System.out.println("Shape "+i+":\n\tArea: "+s.getArea());
        }
    }
}
