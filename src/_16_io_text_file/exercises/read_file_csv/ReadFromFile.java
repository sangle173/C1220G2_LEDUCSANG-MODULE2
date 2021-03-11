package _16_io_text_file.exercises.read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
    public static final String FILE_PATH = "D:\\C1220G2_LEDUCSANG-MODULE2\\src\\_16_io_text_file\\exercises\\read_file_csv\\Demo.csv";
    public static final String REGEX = ",";

    public static List<String[]> readFromFile() {
        List<String[]> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(REGEX);
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

    public static void main(String[] args) {
        List<String[]> strings = readFromFile();
        strings.forEach(string -> System.out.println(string[5]));
    }
}
