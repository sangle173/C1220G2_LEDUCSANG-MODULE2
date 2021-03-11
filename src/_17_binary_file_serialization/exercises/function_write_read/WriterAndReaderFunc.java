package _17_binary_file_serialization.exercises.function_write_read;

import _17_binary_file_serialization.exercises.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterAndReaderFunc{
    private static final String PATH = "D:\\C1220G2_LEDUCSANG-MODULE2\\src\\_17_binary_file_serialization\\exercises\\data\\product.txt";

    public void writeToFile(List<Product> list) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(PATH));
//            for (Product product:list) {
//                oos.writeObject(product);
//            }
            oos.writeObject(list);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("success...");
    }

    public List<Product> readFromFile() throws IOException {
        ObjectInputStream ois = null;
        List<Product> productList=new ArrayList<>();
        try {
            ois = new ObjectInputStream(new FileInputStream(PATH));
            productList=(List<Product>) ois.readObject();
//            Product product = (Product) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
        return productList;
    }
}
