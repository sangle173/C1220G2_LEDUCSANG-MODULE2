package _17_binary_file_serialization.exercises.models;

import java.io.Serializable;

public class Product implements Serializable {
    private String productId, productName, manufacturer, other;
    private double price;

    public Product() {

    }

    public Product(String productId, String productName, String manufacturer, String other, double price) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.other = other;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", other='" + other + '\'' +
                ", price=" + price +
                '}';
    }
}
