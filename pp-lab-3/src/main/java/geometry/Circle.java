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
}
