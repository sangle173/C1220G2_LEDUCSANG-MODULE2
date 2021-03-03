package _05_access_modifier_static_method.practises.com.codegym;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
