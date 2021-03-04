package _04_object_class.exercises;

public class Fan {
    public static final byte SLOW = 1;
    public static final byte MEDIUM = 2;
    public static final byte FAST = 3;
    public static final boolean ON = true;
    public static final boolean OFF = false;
    public static final String BLUE = "blue";


    private int speed;
    private boolean isOn;
    private int radius;
    private String color;

    public Fan(int speed, boolean isOn, int radius, String color) {
        this.speed = SLOW;
        this.isOn = ON;
        this.radius = 5;
        this.color = BLUE;
    }

    public Fan() {

    }

    public static byte getSLOW() {
        return SLOW;
    }

    public static byte getMEDIUM() {
        return MEDIUM;
    }

    public static byte getFAST() {
        return FAST;
    }

    public static boolean isON() {
        return ON;
    }

    public static boolean isOFF() {
        return OFF;
    }

    public static String getBLUE() {
        return BLUE;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn) {
            return "Fan is ON {" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan is OFF {" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(ON);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setSpeed(FAST);
        fan2.setOn(OFF);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setSpeed(MEDIUM);
        System.out.println("Fan 1 info " + fan1.toString());
        System.out.println("Fan 2 info " + fan2.toString());
    }
}
