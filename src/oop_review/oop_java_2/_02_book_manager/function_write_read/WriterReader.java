package oop_review.oop_java_2._02_book_manager.function_write_read;

import oop_review.oop_java_2._02_book_manager.document.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterReader<E> {
    private static final String PATH = "D:\\C1220G2_LEDUCSANG-MODULE2\\src\\oop_review\\oop_java_2\\_02_book_manager\\data\\";

    public void writeToFile(String fileName, List<E> list, boolean writeMode) {
        File file = new File(PATH + fileName);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (E e : list) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error in writing.");
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String[]> readFromFile(String fileName) {
        List<String[]> list = new ArrayList<>();
        File file = new File(PATH + fileName);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                list.add(temp);
            }
        } catch (IOException e) {
            System.out.println("Error in reading.");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
