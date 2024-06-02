package org.example;

import geometry.ColoredCircle;
import geometry.Point;
import geometry.Circle;

import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(10, 10);
        System.out.printf("Point coords: x:%s : y:%s%n", point.getX(), point.getY());

        Circle circle = new Circle(point, 10.2);
        Point circleCenter = circle.getCenter();

        System.out.printf(
                "Circle center: {X: %s, Y: %s}%n",
                circleCenter.getX(),
                circleCenter.getY()
        );

        ColoredCircle cc = new ColoredCircle(point, 10.2, Color.black);
        Point coloredCircleCenter = cc.getCenter();

        System.out.printf(
                "Colored circle center: {X: %s, Y: %s} colored: %s%n",
                coloredCircleCenter.getX(),
                coloredCircleCenter.getY(),
                cc.getColor()
        );

        Circle[] circles = new Circle[10];

        for (int index = 0; index < 10; index++) {
            circles[index] = new Circle(
                    new Point(Math.random() * 10, Math.random() * 10),
                    Math.random() * 5);
        }

        for (int circleIndex = 0; circleIndex < 10; circleIndex++) {
            circles[circleIndex].calculateArea();
        }

        ColoredCircle[] coloredCircles = new ColoredCircle[10];

        for (int index = 0; index < 10; index++) {
            coloredCircles[index] = new ColoredCircle(
                    new Point(Math.random() * 10, Math.random() * 10),
                    Math.random() * 5, getRandomColor());
        }

        for (int coloredCircleIndex = 0; coloredCircleIndex < 10; coloredCircleIndex++) {
            var coloredCircle = coloredCircles[coloredCircleIndex];
            coloredCircle.calculateArea();
            System.out.printf("Circle color: %s", coloredCircle.getColor());
        }
    }

    private static Color getRandomColor() {
        Random rand = new Random();
        Color color;
        switch (rand.nextInt(1, 3)) {
            case 1: {
                color =  Color.red;
                break;
            }

            case 2: {
                color =  Color.black;
                break;
            }

            default: {
                color = Color.GREEN;
                break;
            }
        }

        return color;
    }
}
