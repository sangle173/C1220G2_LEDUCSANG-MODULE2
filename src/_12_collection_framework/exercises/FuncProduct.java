package _12_collection_framework.exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncProduct {
    public static final String PATH = "D:\\C1220G2_LEDUCSANG-MODULE2\\src\\_12_collection_framework\\exercises\\product.csv";

    public static void writeFile(List<Product> list, boolean writeMode) {
        File file = new File(PATH);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (Product product : list) {
                bufferedWriter.write(product.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR IN WRITING FILE.");
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Product> readFromFile() {
        List<Product> productList = new ArrayList<>();
        File file = new File(PATH);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String str[] = line.split(",");
                String id = str[0];
                String name = str[1];
                productList.add(new Product(id, name));
            }
        } catch (IOException e) {
            System.out.println("ERROR IN READING FILE.");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    public static void sortAscending() {
        List<Product> list = FuncProduct.readFromFile();
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        FuncProduct.writeFile(list, false);
        showAllProduct();
    }

    public static void sortDecreasing() {
        List<Product> list = FuncProduct.readFromFile();
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getId().compareTo(o1.getId());
            }
        });
        FuncProduct.writeFile(list, false);
        showAllProduct();
    }

    public static void showAllProduct() {
        System.out.println("\n Product List");
        List<Product> list = FuncProduct.readFromFile();
        if (list.isEmpty()) {
            System.out.println("List product is empty");
            return;
        } else {
            int count = 1;
            for (Product p : list) {
                System.out.println(count + ". " + p.toString());
                count++;
            }
        }
    }
}
