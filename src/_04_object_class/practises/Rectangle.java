package _04_object_class.practises;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle {" + "width = " + width + " , height = " + height + " }";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Rectangle info :" + rectangle.display());
        System.out.println("Rectangle area :" + rectangle.getArea());
        System.out.println("Rectangle perimeter :" + rectangle.getPerimeter());
    }
}
