package geometry;

import java.awt.*;

public class ColoredCircle extends Circle {
    private Color color;

    public ColoredCircle(Point center, double radius, Color color) {
        super(center, radius);
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}
