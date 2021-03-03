package _05_access_modifier_static_method.exercises;

public class Circle {
    private final double RADIUSCONST = 1.0;
    private final String COLORCONST = "red";
    private final double PI = 3.14;
    private double radius;
    private String color;

    public Circle() {
        this.radius = RADIUSCONST;
        this.color = COLORCONST;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
