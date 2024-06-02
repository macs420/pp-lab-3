package org.example;
import geometry.Point;
import geometry.Circle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(10,10);
        System.out.printf("Point coords: x:%s : y:%s%n",point.getX(), point.getY());

        Circle circle = new Circle(point, 10.2);
        Point circleCenter = circle.getCenter();

        System.out.printf(
                "Circle center: {X: %s, Y: %s}",
                circleCenter.getX(),
                circleCenter.getY()
        );

    }
}