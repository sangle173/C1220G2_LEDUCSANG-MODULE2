package oop_review.oop_java_2._02_book_manager.main_controller;

import oop_review.oop_java_2._02_book_manager.manager.BookManager;
import oop_review.oop_java_2._02_book_manager.manager.MagazineManager;
import oop_review.oop_java_2._02_book_manager.manager.NewspaperManager;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static BookManager bookManager = new BookManager();
    static MagazineManager magazineManager = new MagazineManager();
    static NewspaperManager newspaperManager = new NewspaperManager();

    public static void main(String[] args) {
        showMenu();
    }

    private static void showAllDocumentMenu() {
        System.out.println("-----------menu show------------");
        System.out.println("1.Show all book\n" +
                "2.Show all magazine\n" +
                "3.Show all newspaper\n" +
                "4.Back to main menu\n" +
                "0.Exit");
        System.out.println("---------------------------");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    bookManager.showAll();
                    break;
                case "2":
                    magazineManager.showAll();
                    break;
                case "3":
                    newspaperManager.showAll();
                    break;
                case "4":
                    showMenu();
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
            showAllDocumentMenu();
        }
    }

    public static void showAddMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1.Add new book\n" +
                "2.Add new magazine\n" +
                "3.Add new newspaper\n" +
                "4.Back to main menu\n" +
                "0.Exit");
        System.out.println("---------------------------");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    bookManager.add();
                    break;
                case "2":
                    magazineManager.add();
                    break;
                case "3":
                    newspaperManager.add();
                    break;
                case "4":
                    showMenu();
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
            showAddMenu();
        }
    }

    public static void searchByProducerNameMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1.Search book\n" +
                "2.Search magazine\n" +
                "3.Search newspaper\n" +
                "4.Back to main menu\n" +
                "0.Exit");
        System.out.println("---------------------------");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    bookManager.searchByProducerName();
                    break;
                case "2":
                    magazineManager.searchByProducerName();
                    break;
                case "3":
                    newspaperManager.searchByProducerName();
                    break;
                case "4":
                    showMenu();
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
            searchByProducerNameMenu();
        }
    }
    public static void sortMenu(){
        System.out.println("-----------menu------------");
        System.out.println("1.Sort book\n" +
                "2.Sort magazine\n" +
                "3.Sort newspaper\n" +
                "4.Back to main menu\n" +
                "0.Exit");
        System.out.println("---------------------------");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    bookManager.sortByProducerName();
                    break;
                case "2":
                    magazineManager.sortByProducerName();
                    break;
                case "3":
                    newspaperManager.sortByProducerName();
                    break;
                case "4":
                    showMenu();
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
            sortMenu();
        }
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1.Add new document\n" +
                "2.Show all document\n" +
                "3.Search document by producer name\n" +
                "4.Sort document by product name\n" +
                "0.Exit");
        System.out.println("---------------------------");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;

        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    showAddMenu();
                    break;
                case "2":
                    showAllDocumentMenu();
                    break;
                case "3":
                    searchByProducerNameMenu();
                    break;
                case "4":
                    sortMenu();
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
}
