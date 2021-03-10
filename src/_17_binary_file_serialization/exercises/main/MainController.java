package _17_binary_file_serialization.exercises.main;

import _17_binary_file_serialization.exercises.function_write_read.WriterAndReaderFunc;
import _17_binary_file_serialization.exercises.models.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainController {
    static WriterAndReaderFunc writerAndReaderFunc = new WriterAndReaderFunc();

    public static void main(String[] args) throws IOException {
        Product product = new Product("11", "11", "11", "11", 11);
        List<Product> productList=new ArrayList<>();
        productList.add(product);
        writerAndReaderFunc.writeToFile(productList);
        writerAndReaderFunc.readFromFile();
    }
}
