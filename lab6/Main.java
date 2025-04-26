public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10, new Point(0,10));

        System.out.println("------------------------------------------");

        System.out.println("Area of the rectangle = " + rect.area());
        System.out.println("Perimeter of the rectangle = " + rect.perimeter());
        for (int i = 0; i < rect.corners().length; i++) {
            System.out.println("Point " + (i+1) + ": x = " + rect.corners()[i].getxCoord() + ", y = " + rect.corners()[i].getyCoord());
        }

        System.out.println("------------------------------------------");

        Circle circle1 = new Circle(5, new Point(0,0));

        System.out.printf("Area of the circle = %.2f\n", circle1.area());
        System.out.printf("Perimeter of the circle = %.2f\n", circle1.perimeter());

        Circle circle2 = new Circle(4, new Point(3,4));

        System.out.println("They intersect each other = " + Boolean.toString(circle1.intersect(circle2)).toUpperCase());

        System.out.println("------------------------------------------");
    }
}
