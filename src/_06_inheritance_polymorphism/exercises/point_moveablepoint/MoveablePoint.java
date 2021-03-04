package _06_inheritance_polymorphism.exercises.point_moveablepoint;

import _06_inheritance_polymorphism.exercises.point2d_point3d.Point2D;

public class MoveablePoint extends Point2D {
    private float xSpeed, ySpeed;

    public MoveablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getX(), getY(), getXSpeed(), getYSpeed()};
    }

    public MoveablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} ";
    }
}
