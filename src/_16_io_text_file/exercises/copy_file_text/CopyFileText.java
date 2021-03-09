package _16_io_text_file.exercises.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    private static final String  TARGET_PATH= "src\\_16_io_text_file\\practises\\";
    private static final String  SOURCE_PATH= "src\\_16_io_text_file\\exercises\\copy_file_text\\";

    public static StringBuffer readFileText(String fileName) throws Exception {
        StringBuffer content = new StringBuffer();
        try {
            File inputFile = new File(SOURCE_PATH + fileName);

            if (!inputFile.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line = "";
            while ((line = br.readLine()) != null) {
                content.append(line + "\n");
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File not found or not available content!");
        } finally {
            return content;
        }
    }

    public static void writeFileText(String fileName, StringBuffer content) {
        FileWriter fileWriter = null;
        try {
            File outputFile = new File(TARGET_PATH + fileName);
            if (outputFile.exists()) {
                System.out.println("File already exist!");
            } else {
                fileWriter = new FileWriter(outputFile);
                int i;
                for (i = 0; i < content.length(); i++) {
                    fileWriter.write(content.charAt(i));
                }
                System.out.println("Done");
                System.out.println("File contains " + i + " characters");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of Input file: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Enter the name of Output file: ");
        String outputFileName = scanner.nextLine();
        try {
            StringBuffer content = readFileText(inputFileName);
            writeFileText(outputFileName, content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
