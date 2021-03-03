package _06_inheritance_polymorphism.exercises.point2d_point3d;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D);
        point2D=new Point2D(0.24f,0.18f);
        System.out.println(point2D);
        point2D.setXY(10.65f,29.16f);
        System.out.println(point2D);
        point2D=new Point2D();
        System.out.println(point2D);
    }
}
