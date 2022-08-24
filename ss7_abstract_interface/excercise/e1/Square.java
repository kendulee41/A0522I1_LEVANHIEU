package ss7_abstract_interface.excercise.e1;

public class Square extends Shape {
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
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.size += this.size*(percent/100);
    }
}
