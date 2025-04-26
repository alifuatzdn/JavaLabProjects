package shapes;

public class Square extends Shape{

    protected double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side*side;
    }
}
