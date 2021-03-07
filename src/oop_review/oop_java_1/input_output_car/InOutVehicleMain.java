package oop_review.oop_java_1.input_output_car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InOutVehicleMain {
    Scanner scanner = new Scanner(System.in);
    List<Vehicle> vehicleList = new ArrayList<>();

    public static void main(String[] args) {
        InOutVehicleMain inOutVehicleMain = new InOutVehicleMain();
        inOutVehicleMain.displayMainMenu();
    }

    public void displayMainMenu() {
        System.out.println("Main menu\n" +
                "1.Create vehicle \n" +
                "2.Show Tax money\n" +
                "0.Exit");
        int choice;
        do {
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createVehicle();
                    break;
                case 2:
                    showVehicleTax(vehicleList);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
            }
        } while (choice != 0);
    }

    public void showVehicleTax(List<Vehicle> vehicleList) {
        int count = 1;
        for (Vehicle vehicle : vehicleList) {
            System.out.println(count + ".\t" + vehicle);
            count++;
        }
    }

    public void createVehicle() {
        System.out.println("Enter vehicle name");
        String vehicleName;
        vehicleName = scanner.nextLine();
        System.out.println("Enter cylinder capacity of vehicle");
        double cylinderCapacity;
        cylinderCapacity = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter price of vehicle");
        double priceVehicle = Double.parseDouble(scanner.nextLine());
        Vehicle car = new Vehicle(vehicleName, cylinderCapacity, priceVehicle);
        vehicleList.add(car);
    }
}
