package oop_review.oop_java_2._03_candidates.main;

import oop_review.oop_java_2._03_candidates.manager.ACandidateManager;

import java.util.Scanner;


public class MainController {
    Scanner scanner=new Scanner(System.in);
    ACandidateManager aCandidateManager=new ACandidateManager();
    static MainController mainController=new MainController();
    public static void main(String[] args) {
        mainController.displayMainMenu();
    }
    public  void displayMainMenu(){
        System.out.println("---Main Menu---\n" +
                "1.Add new candidates\n" +
                "2.Show candidates\n" +
                "3.Search candidates by name\n" +
                "4.Delete candidates by identification number\n" +
                "0.Exit");
        System.out.println("-----------------");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;

        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addCandidateMenu();
                    break;
                case "2":
                    showAllCandidatesMenu();
                    break;
                case "3":
                    searchCandidatesMenu();
                    break;
                case "4":
                    deleteMenu();
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
            displayMainMenu();
        }
    }
    public void addCandidateMenu(){
        System.out.println("--Menu add A Candidates--\n" +
                "1.Add new A of Candidates\n" +
                "2.Add new B of Candidates\n" +
                "3.Add new C of Candidates\n" +
                "4.Back to Main Menu\n" +
                "0.Exit");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;

        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    aCandidateManager.addCandidate();
                    break;
                case "2":
                    showAllCandidatesMenu();
                    break;
                case "3":
                    break;
                case "4":
                    displayMainMenu();
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
        }
        addCandidateMenu();
    }
    public void showAllCandidatesMenu(){
        System.out.println("--Menu show Candidates--\n" +
                "1.Show all A of Candidates\n" +
                "2.Show all B of Candidates\n" +
                "3.Show all C of Candidates\n" +
                "4.Back to Main Menu\n" +
                "0.Exit");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;

        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    aCandidateManager.showAllACandidates();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    displayMainMenu();
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
        }
        showAllCandidatesMenu();
    }
    public void searchCandidatesMenu(){
        System.out.println("--Menu search Candidates by name--\n" +
                "1.Search by name A of Candidates\n" +
                "2.Search by name B of Candidates\n" +
                "3.Search by name C of Candidates\n" +
                "4.Back to Main Menu\n" +
                "0.Exit");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;

        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    aCandidateManager.searchByACandidateName();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    displayMainMenu();
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
        }
        searchCandidatesMenu();
    }
    public void deleteMenu(){
        System.out.println("--Menu delete Candidates--\n" +
                "1.Delete by identification number of A Candidates\n" +
                "2.Delete by identification number of B Candidates\n" +
                "3.Delete by identification number of C Candidates\n" +
                "4.Back to Main Menu\n" +
                "0.Exit");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;

        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    aCandidateManager.deleteByIdentificationNumber();
                    break;
                case "2":
                    showAllCandidatesMenu();
                    break;
                case "3":
                    break;
                case "4":
                    displayMainMenu();
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
        }
        deleteMenu();
    }
}
