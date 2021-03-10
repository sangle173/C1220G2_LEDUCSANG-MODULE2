package _16_io_text_file.exercises.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    private static final String TARGET_PATH = "src\\_16_io_text_file\\practises\\";
    private static final String SOURCE_PATH = "src\\_16_io_text_file\\exercises\\copy_file_text\\";

    public static List<String> readFromFile(String fileName) {
        List<String> list = new ArrayList<>();
        File file = new File(SOURCE_PATH + fileName);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error in reading.");
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void writeToFile(String fileName, List<String> list, boolean writeMode) {
        File file = new File(TARGET_PATH + fileName);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (String string : list) {
                bufferedWriter.write(string, 0, string.length());
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = readFromFile("FileSource1.txt");
        writeToFile("FileTarget1.txt", list, false);
        list = readFromFile("FileSource2.txt");
        writeToFile("FileTarget2.txt", list, false);
    }
}
