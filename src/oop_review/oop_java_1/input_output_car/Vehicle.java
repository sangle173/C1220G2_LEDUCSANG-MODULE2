package oop_review.oop_java_1.input_output_car;

public class Vehicle {
    private String vehicleName;
    private double cylinderCapacity;
    private double vehiclePrice;

    public Vehicle() {
    }

    public Vehicle(String vehicleName, double cylinderCapacity, double vehiclePrice) {
        this.vehicleName = vehicleName;
        this.cylinderCapacity = cylinderCapacity;
        this.vehiclePrice = vehiclePrice;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public double getTaxOfVehicle() {
        if (this.cylinderCapacity < 100) {
            return this.vehiclePrice * 1 / 100;
        } else if (this.cylinderCapacity <= 200) {
            return this.vehiclePrice * 3 / 100;
        } else {
            return this.vehiclePrice * 5 / 100;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", cylinderCapacity=" + cylinderCapacity + "cc" +
                ", priceVehicle=" + vehiclePrice + "Vnd" +
                ", tax of vehicle=" + this.getTaxOfVehicle() + "Vnd" +
                '}';
    }
}
