public class Point {
    private int xCoord;
    private int yCoord;

    public Point(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public double distanceto(Point point) {
        return Math.sqrt(Math.pow(getxCoord() - point.getxCoord(), 2) + Math.pow(getyCoord() - point.getyCoord(), 2));
    }
}
