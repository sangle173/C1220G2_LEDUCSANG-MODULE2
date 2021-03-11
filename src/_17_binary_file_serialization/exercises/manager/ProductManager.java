package _17_binary_file_serialization.exercises.manager;

import _17_binary_file_serialization.exercises.function_write_read.WriterAndReaderFunc;
import _17_binary_file_serialization.exercises.models.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    WriterAndReaderFunc writerAndReaderFunc = new WriterAndReaderFunc();
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager;
    List<Product> productList = new ArrayList<>();

    public void add() throws IOException {
        String productId = inputProductId();
        String productName = inputProductName();
        String manufacturer = inputManufacturer();
        String other = inputOther();
        double price = inputPrice();
        Product product = new Product(productId, productName, manufacturer, other, price);
        productList.add(product);
        writerAndReaderFunc.writeToFile(productList);
    }

    public void show() throws IOException {
        List<Product> list = writerAndReaderFunc.readFromFile();
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void search() throws IOException {
        List<Product> list = writerAndReaderFunc.readFromFile();
        System.out.println("Enter the product name you want to search");
        String productNameSearch = scanner.nextLine();
        for (Product product : list) {
            if (productNameSearch.equals(product.getProductName())) {
                System.out.println("The product info you want to search is \n" + product);
                return;
            }
        }
        System.out.println("The name you want to search not available");
    }

    private double inputPrice() {
        System.out.println("Enter product price");
        while (true) {
            try {
                double price = Double.parseDouble(scanner.nextLine());
                return price;
            } catch (NumberFormatException exception) {
                System.out.println("invalid! Input price again");
            }
        }
    }

    private String inputOther() {
        System.out.println("Enter product other");
        return scanner.nextLine();
    }

    private String inputManufacturer() {
        System.out.println("Enter product manufacturer");
        return scanner.nextLine();
    }

    private String inputProductName() {
        System.out.println("Enter product name");
        return scanner.nextLine();
    }

    private String inputProductId() {
        System.out.println("Enter product id");
        return scanner.nextLine();
    }
}
