public class Circle {
    private int radius;
    private Point center;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double area() {
        return radius*radius*Math.PI;
    }

    public double perimeter() {
        return 2*radius*Math.PI;
    }

    public boolean intersect(Circle circle) {
        double distance = center.distanceto(circle.getCenter());

        if (distance <= circle.getRadius() + radius) {
            return true;
        }
        return false;
    }
}
