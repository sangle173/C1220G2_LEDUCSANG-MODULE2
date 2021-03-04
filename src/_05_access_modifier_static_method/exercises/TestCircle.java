package _05_access_modifier_static_method.exercises;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        circle.setColor("Blue");
        circle.setRadius(4.8);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
    }

}
