package _04_object_class.practises;

import java.util.Scanner;

public class Circle {
    double radius;
    String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double v) {
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String displayCircle() {
        return "Circle {" + "radius = " + radius + " , color = " + color + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = scanner.nextDouble();
        System.out.println("Enter color of Circle");
        String color = scanner.next();
        Circle circle = new Circle(radius, color);
        System.out.println("Circle infor : " + circle.displayCircle());
        System.out.println("Circle area : " + circle.getArea());
        System.out.println("Circle perimeter : " + circle.getPerimeter());
        circle.setColor("green");
        circle.setRadius(15);
        System.out.println("Circle infor : " + circle.displayCircle());
    }
}
