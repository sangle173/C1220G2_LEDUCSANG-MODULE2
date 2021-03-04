package _06_inheritance_polymorphism.exercises.point_moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(1f, 3.4f, 5.8f, 4.7f);
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2.23f, 2.5f);
        System.out.println(moveablePoint);
        moveablePoint.setXY(2.65f, 17.34f);
        System.out.println(moveablePoint);
        moveablePoint.setSpeed(5.6f, 6.89f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
