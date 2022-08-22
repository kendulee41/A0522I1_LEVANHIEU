package ss7_abstract_interface.excercise.e2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[5];
        shapeArray[0] = new Circle(2.5);
        shapeArray[1] = new Square();
        shapeArray[2] = new Rectangle(1.5,2.0);
        shapeArray[3] = new Square(3);
        shapeArray[4] = new Circle();
        int i=1;
        for (Shape s : shapeArray){
            if (s instanceof Colorable){
                System.out.println("Shape "+i+"\nArea: "+s.getArea());
                s.howToColor();
                System.out.println("======================");
            }else {
                System.out.println("Shape "+i+"\nArea: "+s.getArea());
                System.out.println("======================");
            }
            i++;
        }
    }
}
