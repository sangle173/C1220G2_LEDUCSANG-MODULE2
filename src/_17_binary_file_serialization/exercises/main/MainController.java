package _17_binary_file_serialization.exercises.main;

import _17_binary_file_serialization.exercises.function_write_read.WriterAndReaderFunc;
import _17_binary_file_serialization.exercises.manager.ProductManager;
import _17_binary_file_serialization.exercises.models.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager=new ProductManager();


    public static void main(String[] args) throws IOException {
//        Product product = new Product("11", "11", "11", "11", 11);
//        Product product1 = new Product("111", "111", "111", "111", 111);
//        List<Product> productList=new ArrayList<>();
////        productList.add(product);
////        productList.add(product1);
//        productList.add(product);
//        productList.add(product1);
//        writerAndReaderFunc.writeToFile(productList);
//
//        writerAndReaderFunc.readFromFile();
        MainController mainController=new MainController();
        mainController.displayMainMenu();
    }

    public void displayMainMenu() throws IOException {
        System.out.println("--Main-Menu---\n" +
                "1.Add product\n" +
                "2.Show info product\n" +
                "3.Search by product name\n" +
                "0.Exit");
        System.out.println("-----------------");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;

        while (true) {

            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    productManager.add();
                    break;
                case "2":
                    productManager.show();
                    break;
                case "3":
                    productManager.search();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            displayMainMenu();
        }
    }

}
