package _17_binary_file_serialization.exercises.function_write_read;

import _17_binary_file_serialization.exercises.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterAndReaderFunc{
    private static final String PATH = "D:\\C1220G2_LEDUCSANG-MODULE2\\src\\_17_binary_file_serialization\\exercises\\data\\product.txt";

    public static void writeToFile(List<Product> list) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(PATH));
            for (Product product:list) {
                oos.writeObject(product);
            }
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("success...");
    }

    public void readFromFile() throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(PATH));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }

    }
}
