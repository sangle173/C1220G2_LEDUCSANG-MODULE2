package oop_review.oop_java_2._02_book_manager.main_controller;

import oop_review.oop_java_2._02_book_manager.manager.BookManager;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        BookManager bookManager = new BookManager();
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    bookManager.add();
                    break;
                case "2":
                    bookManager.showall();
                    break;
                case "3":
                    bookManager.searchByAuthorName();
                    break;
                case "4":
                    bookManager.sortByAuthorName();
                    break;
                case "5":
                    bookManager.sortByNoOfPage();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }


    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1.Add new book\n" +
                "2.Show all book\n" +
                "3.Search book by author name\n" +
                "4.Sort book by author name\n" +
                "5.Sort book by no of page\n" +
                "0.Exit");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
