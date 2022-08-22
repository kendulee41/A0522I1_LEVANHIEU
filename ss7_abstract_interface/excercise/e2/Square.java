package ss7_abstract_interface.excercise.e2;

public class Square extends Shape implements Colorable{
    private double size = 2.0;

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return this.size*this.size;
    }

    @Override
    public double getPerimeter() {
        return this.size*4;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
