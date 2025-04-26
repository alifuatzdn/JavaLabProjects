package shapes3d;

import shapes2d.Circle;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double area() {
        return (super.area() * 2) + (height * super.perimeter());
    }
    public double volume() {
        return height * super.area();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }
}
