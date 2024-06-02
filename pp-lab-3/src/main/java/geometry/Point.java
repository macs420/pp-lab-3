package geometry;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Point setX(double x) {
        this.x = x;
        return this;
    }

    public Point setY(double y) {
        this.y = y;
        return this;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
