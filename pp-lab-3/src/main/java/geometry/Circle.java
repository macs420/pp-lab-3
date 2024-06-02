package geometry;

public class Circle {
    private Point center;
    private double radius;

    public Point getCenter() {
        return this.center;
    }

    public double GetRadius() {
        return this.radius;
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * this.radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println(
                String.format(
                        "Circle pointed in X: %s Y: %s has area: %s u^2",
                        this.center.getX(),
                        this.center.getY(),
                        Math.PI * Math.pow(radius, 2)
                )
        );
    }
}
