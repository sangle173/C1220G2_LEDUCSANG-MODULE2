package oop_review.oop_java_2._02_book_manager.manager;

import oop_review.oop_java_2._02_book_manager.document.Book;
import oop_review.oop_java_2._02_book_manager.document.Newspapers;
import oop_review.oop_java_2._02_book_manager.function_write_read.WriterReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewspaperManager {
    public WriterReader writerReader = new WriterReader();
    public static Scanner scanner = new Scanner(System.in);
    private List<Newspapers> newspapersList = new ArrayList<>();
    private NewspaperManager newspaperManager;

    public void add() {
        String noOfNumber = inputNoOfNumber();
        String producerName = inputProducerName();
        int publishNumber = inputPublishNumber();
        String dayOfPublish = inputDayOfPublish();
        Newspapers newspapers = new Newspapers(noOfNumber, producerName, publishNumber, dayOfPublish);
        newspapersList.add(newspapers);
        writerReader.writeToFile("Newspaper.csv", newspapersList, true);
    }

    public List<Newspapers> show() {
        List<String[]> list = writerReader.readFromFile("Newspaper.csv");
        List<Newspapers> newspapersList = new ArrayList<>();
        for (String[] newspaperInfo : list) {
            Newspapers newspapers = new Newspapers(newspaperInfo);
            newspapersList.add(newspapers);
        }
        return newspapersList;
    }

    public void showAll() {
        List<Newspapers> newspapersList = show();
        int count = 1;
        for (Newspapers newspapers : newspapersList) {
            System.out.println(count + ".\t" + newspapers.showInfo());
            count++;
        }
    }
    public void searchByProducerName(){
        List<Newspapers> newspapersList = show();
        System.out.println("Enter  name your want to search");
        String producerName = scanner.nextLine();
        for (Newspapers newspapers : newspapersList) {
            if (newspapers.getProducerName().equals(producerName)) {
                System.out.println(newspapers.showInfo());
                return;
            }
        }
        System.out.println("The name not available in book list");
    }
    public void sortByProducerName() {
        List<Newspapers> newspapersList = show();
        Collections.sort(newspapersList, new SortByProducerName());
        System.out.println("The document has been sorted");

    }

    private String inputDayOfPublish() {
        System.out.println("Enter day of publish");
        return scanner.nextLine();
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
