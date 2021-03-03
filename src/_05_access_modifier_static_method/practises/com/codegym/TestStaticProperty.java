package _05_access_modifier_static_method.practises.com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1= new Car("Mazda", "Skyactive 2");
        System.out.println(Car.numberOfCar);

        Car car2= new Car("Honda", "Skyactive 4");
        System.out.println(Car.numberOfCar);

        Car car3= new Car("Mazda", "Skyactive 5");
        System.out.println(Car.numberOfCar);

        Car car4= new Car("Mazda", "Skyactive 5");
        System.out.println(Car.numberOfCar);
    }
}
