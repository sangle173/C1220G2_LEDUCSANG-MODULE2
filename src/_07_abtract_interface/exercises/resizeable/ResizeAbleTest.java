package _07_abtract_interface.exercises.resizeable;

import _07_abtract_interface.exercises.Circle;
import _07_abtract_interface.exercises.Rectangle;
import _07_abtract_interface.exercises.Shape;
import _07_abtract_interface.exercises.Square;

public class ResizeAbleTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(9.0, 6.4);
        shapes[2] = new Square(9.8);
        for (Shape shape : shapes) {
            System.out.println("Before resize " + shape + " and area is " + shape.getArea());
        }
        for (Shape shape : shapes) {
            shape.resize(Math.random());
        }
    }
}
