package _06_inheritance_polymorphism.exercises.point2d_point3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(1.22f,2.67f,8.65f);
        System.out.println(point3D);
        point3D.setXYZ(10.27f,2.56f,7.18f);
        System.out.println(point3D);
    }

}
