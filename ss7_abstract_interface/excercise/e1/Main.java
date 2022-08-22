package ss7_abstract_interface.excercise.e1;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[2];
        arr[0] = new Rectangle(2,3);
        arr[1] = new Circle(1.5);
        for (Shape s : arr){
            System.out.println(s);
        }
        for (Shape s : arr){
            s.resize(Math.random() * 10000);
        }
        System.out.println("Shape resize:");
        for (Shape s : arr){
            System.out.println(s);
        }
    }
}
