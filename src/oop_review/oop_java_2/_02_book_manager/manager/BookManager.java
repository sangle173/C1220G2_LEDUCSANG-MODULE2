package oop_review.oop_java_2._02_book_manager.manager;

import oop_review.oop_java_2._02_book_manager.document.Book;
import oop_review.oop_java_2._02_book_manager.function_write_read.WriterReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    public WriterReader writerReader = new WriterReader();
    public static Scanner scanner = new Scanner(System.in);
    private List<Book> bookLists = new ArrayList<>();
    private BookManager bookManager;

    //    public BookManager(){
//        bookManager=new BookManager();
//        bookLists=bookManager.writerReader.readFromFile();
//    }
    public void add() {
        String noOfNumber = inputNoOfNumber();
        String producerName = inputProducerName();
        int publishNumber = inputPublishNumber();
        String authorName = inputAuthorName();
        int noOfPage = inputNoOfPage();
        Book book = new Book(noOfNumber, producerName, publishNumber, authorName, noOfPage);
        bookLists.add(book);
        writerReader.writeToFile("Book.csv", bookLists, true);
    }

    public List<Book> show() {
        List<String[]> list = writerReader.readFromFile("Book.csv");
        List<Book> bookList = new ArrayList<>();
        for (String[] bookInfo : list) {
            Book book = new Book(bookInfo);
            bookList.add(book);
        }
        return bookList;
    }

    public void showall() {
        List<Book> bookList = show();
        int count = 1;
        for (Book book : bookList) {
            System.out.println(count + ".\t" + book.showInfo());
            count++;
        }
    }
    public void searchByAuthorName(){
        List<Book> bookLists = show();
        System.out.println("Enter author name your want to search");
        String authorNameSearch=scanner.nextLine();
        for (Book book:bookLists) {
            if (book.getAuthorName().equals(authorNameSearch)){
                System.out.println(book.showInfo());
                return;
            }
        }
        System.out.println("The name not available in book list");
    }

    public void sortByAuthorName() {
        List<Book> bookLists = show();
        Collections.sort(bookLists, new SortByAuthorName());
    }

    public void sortByNoOfPage() {
        List<Book> bookLists = show();
        Collections.sort(bookLists, new SortByNoOfPage());
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

    private String inputAuthorName() {
        System.out.println("Enter author name");
        return scanner.nextLine();
    }

    private int inputNoOfPage() {
        System.out.println("Enter No of Page");
        while (true) {
            try {
                int noOfPage = Integer.parseInt(scanner.nextLine());
                return noOfPage;
            } catch (NumberFormatException exception) {
                System.out.println("invalid! Input publish number again");
            }
        }
    }

    public List<Book> getBookLists() {
        return bookLists;
    }

    public void setBookLists(List<Book> bookLists) {
        this.bookLists = bookLists;
    }
}
