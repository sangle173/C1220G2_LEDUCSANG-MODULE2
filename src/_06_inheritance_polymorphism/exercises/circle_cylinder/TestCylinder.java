package _06_inheritance_polymorphism.exercises.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(29.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(2.9, 3.8);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.6, "pink", 1.8);
        System.out.println(cylinder);
    }

}
