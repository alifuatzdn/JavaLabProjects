public class Rectangle {

    private int sideA;
    private int sideB;
    private Point topLeft;

    public Rectangle(int sideA, int sideB, Point topLeft) {
        this.sideA = sideA; //width
        this.sideB = sideB;  // height
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int area() {
        return sideA*sideB;
    }

    public int perimeter() {
        return (sideA+sideB) * 2;
    }

    public Point[] corners() {
        Point[] corners = new Point[4];
        corners[0] = topLeft;
        corners[1] = new Point(topLeft.getxCoord()+sideA, topLeft.getyCoord());
        corners[2] = new Point(topLeft.getxCoord(), topLeft.getyCoord()-sideB);
        corners[3] = new Point(topLeft.getxCoord()+sideA, topLeft.getyCoord()-sideB);
        return corners;
    }
}
