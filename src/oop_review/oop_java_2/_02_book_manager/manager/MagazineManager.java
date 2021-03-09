package oop_review.oop_java_2._02_book_manager.manager;

import oop_review.oop_java_2._02_book_manager.document.Book;
import oop_review.oop_java_2._02_book_manager.document.Magazine;
import oop_review.oop_java_2._02_book_manager.function_write_read.WriterReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MagazineManager {
    public WriterReader writerReader = new WriterReader();
    public static Scanner scanner = new Scanner(System.in);
    private List<Magazine> magazineList = new ArrayList<>();
    private MagazineManager magazineManager;

    public void add() {
        String noOfNumber = inputNoOfNumber();
        String producerName = inputProducerName();
        int publishNumber = inputPublishNumber();
        int noOfPublish = inputNoOfPublish();
        String monthOfPublish = inputMonthOfPublish();
        Magazine magazine = new Magazine(noOfNumber, producerName, publishNumber, noOfPublish, monthOfPublish);
        magazineList.add(magazine);
        writerReader.writeToFile("Magazine.csv", magazineList, true);
    }

    public List<Magazine> show() {
        List<String[]> list = writerReader.readFromFile("Magazine.csv");
        List<Magazine> magazineList = new ArrayList<>();
        for (String[] magazineInfo : list) {
            Magazine magazine = new Magazine(magazineInfo);
            magazineList.add(magazine);
        }
        return magazineList;
    }
    public void searchByProducerName(){
        List<Magazine> magazineList = show();
        System.out.println("Enter  name your want to search");
        String producerName = scanner.nextLine();
        for (Magazine magazine: magazineList) {
            if (magazine.getProducerName().equals(producerName)) {
                System.out.println(magazine.showInfo());
                return;
            }
        }
        System.out.println("The name not available in book list");
    }

    public void showAll() {
        List<Magazine> magazineList = show();
        for (Magazine magazine : magazineList) {
            int count = 1;
            System.out.println(count + ".\t" + magazine.showInfo());
            count++;
        }
    }
    public void sortByProducerName() {
        List<Magazine> magazineList = show();
        Collections.sort(magazineList, new SortByProducerName());
        System.out.println("The document has been sorted");
    }

    public void searchByNoOfPublish() {
        List<Magazine> magazineList = show();
        System.out.println("Enter no of publish your want to search");
        while (true) {
            try {
                int noOfPublishSearch = Integer.parseInt(scanner.nextLine());
                for (Magazine magazine:magazineList) {
                    if (noOfPublishSearch==magazine.getNoOfPublish()){
                        System.out.println(magazine.showInfo());
                        return;
                    }
                }
                System.out.println("The no of publish of magazine your want to search not available ");
            } catch (NumberFormatException exception) {
                System.out.println("invalid! Input publish number again");
            }
        }
    }

    private String inputMonthOfPublish() {
        System.out.println("Enter month of publish");
        return scanner.nextLine();
    }

    private int inputNoOfPublish() {
        System.out.println("Enter no of publish");
        while (true) {
            try {
                int noOfPublish = Integer.parseInt(scanner.nextLine());
                return noOfPublish;
            } catch (NumberFormatException exception) {
                System.out.println("invalid! Input publish number again");
            }
        }
    }


    private String inputNoOfNumber() {
        System.out.println("Enter document No of number");
        return scanner.nextLine();
    }

    private String inputProducerName() {
        System.out.println("Enter producer name");
        return scanner.nextLine();
    }

    private int inputPublishNumber() {
        System.out.println("Enter publish Number");
        while (true) {
            try {
                int publishNumber = Integer.parseInt(scanner.nextLine());
                return publishNumber;
            } catch (NumberFormatException exception) {
                System.out.println("invalid! Input publish number again");
            }
        }
    }
}
