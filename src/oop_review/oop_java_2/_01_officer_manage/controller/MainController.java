package oop_review.oop_java_2._01_officer_manage.controller;

import oop_review.oop_java_2._01_officer_manage.officer.Employee;
import oop_review.oop_java_2._01_officer_manage.officer.Engineering;
import oop_review.oop_java_2._01_officer_manage.officer.Officer;
import oop_review.oop_java_2._01_officer_manage.officer.Worker;

import java.util.*;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    List<Officer> officerList = new ArrayList<>();


    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.listDefault();
        mainController.displayMainMenu();
    }

    public void listDefault() {
        Officer engineering1 = new Engineering("Sang", "17/08/1991", "Male", "Da Nang", "Electric");
        officerList.add(engineering1);
        Officer engineering2 = new Engineering("Hau", "21/03/1996", "Male", "Ha Noi", "Car");
        officerList.add(engineering2);
        Officer engineering3 = new Engineering("Kha", "15/01/1998", "Male", "Sai gon", "Mechanical");
        officerList.add(engineering3);
        Officer employee1 = new Employee("Duc", "16/12/1999", "Male", "Da Nang", "Waiter");
        officerList.add(employee1);
        Officer employee2 = new Employee("Tung", "31/12/1999", "Male", "Da Nang", "PA");
        officerList.add(employee2);
        Officer worker1 = new Worker("Tuan", "19/04/2000", "Male", "Quang Tri", "3/7");
        officerList.add(worker1);
        Officer worker2 = new Worker("Kien", "12/09/2001", "Male", "Da Nang", "4/7");
        officerList.add(worker2);
    }

    public void displayMainMenu() {

        System.out.println("Main Menu\n" +
                "1.Create new officer\n" +
                "2.Search officer by name\n" +
                "3.Sort by name\n" +
                "4.Show all officer information\n" +
                "0.Exit");
        int choice;
        do {
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createNewOfficer();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    sortByName();
                    break;
                case 4:
                    showOfficer();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter again");
            }
        } while (choice != 0);
    }

    public void showOfficer() {
        System.out.println("Show Menu\n" +
                "1.Show all\n" +
                "2.Show Engineering\n" +
                "3.Show Workers\n" +
                "4.Show Employees" +
                "5.Back to main menu\n" +
                "0.Exit");
        int choiceShowMenu;
        do {
            System.out.println("Enter your choice");
            choiceShowMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceShowMenu) {
                case 1:
                    showAllOfficer();
                    break;
                case 2:
                    showAllEngineering();
                    break;
                case 3:
                    showAllWorker();
                    break;
                case 4:
                    showAllEmployee();
                    break;
                case 5:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
            }
        } while (choiceShowMenu != 0);
    }

    private void showAllEmployee() {
        for (Officer employee : officerList) {
            if (employee instanceof Employee) {
                System.out.println(employee);
            }
        }
    }

    private void showAllWorker() {
        for (Officer worker : officerList) {
            if (worker instanceof Worker) {
                System.out.println(worker);
            }
        }
    }

    private void showAllEngineering() {
        for (Officer engineering : officerList) {
            if (engineering instanceof Engineering) {
                System.out.println(engineering);
            }
        }
    }

    private void showAllOfficer() {
        int count = 1;
        for (Officer officer : officerList) {
            System.out.println(count + ".\t" + officer);
            count++;
        }
    }

    public void sortByName() {
        System.out.println("Sort Menu\n" +
                "1.Sort by ascending\n" +
                "2.Sort by decreasing\n" +
                "3.Back to Main Menu\n" +
                "0.Exit");
        int choiceSortMenu;
        do {
            System.out.println("Enter your choice");
            choiceSortMenu=Integer.parseInt(scanner.nextLine());
            switch (choiceSortMenu){
                case 1:
                    Collections.sort(officerList, new Comparator<Officer>() {
                        @Override
                        public int compare(Officer o1, Officer o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    System.out.println("Your list have been already sorted");
                    break;
                case 2:
                    Collections.sort(officerList, new Comparator<Officer>() {
                        @Override
                        public int compare(Officer o1, Officer o2) {
                            return o2.getName().compareTo(o1.getName());
                        }
                    });
                    System.out.println("Your list have been already sorted");
                    break;
                case 3:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
            }
        }while (choiceSortMenu!=0);

    }

    public void searchByName() {
        System.out.println("Search new officer menu\n" +
                "1.Search by name of Engineering\n" +
                "2.Search by name of Worker\n" +
                "3.Search by name of Employee\n" +
                "4.Back to Main menu\n" +
                "0.Exit");
        int choiceSearchMenu;
        do {
            System.out.println("Enter you choice");
            choiceSearchMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceSearchMenu) {
                case 1:
                    searchByNameOfEngineering();
                    break;
                case 2:
                    searchByNameOfWorker();
                    break;
                case 3:
                    searchByNameOfEmployee();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter again");
            }
        } while (choiceSearchMenu != 0);
    }

    private void searchByNameOfEmployee() {
        System.out.println("Enter the name of Employee you want to search");
        String nameSearch=scanner.nextLine();
        for (Officer employee:officerList) {
            if (employee instanceof Employee){
                if (nameSearch.equals(employee.getName())){
                    System.out.println(employee);
                }
            }
        }
        System.out.println("The name you want to search not available");
    }

    private void searchByNameOfWorker() {
        System.out.println("Enter the name of Worker you want to search");
        String nameSearch=scanner.nextLine();
        for (Officer worker:officerList) {
            if (worker instanceof Worker){
                if (nameSearch.equals(worker.getName())){
                    System.out.println(worker);
                }
            }
        }
        System.out.println("The name you want to search not available");
    }

    private void searchByNameOfEngineering() {
        System.out.println("Enter the name of Engineering you want to search");
        String nameSearch=scanner.nextLine();
        for (Officer engineering:officerList) {
            if (engineering instanceof Engineering){
                if (nameSearch.equals(engineering.getName())){
                    System.out.println(engineering);
                }
            }
        }
        System.out.println("The name you want to search not available");
    }

    public void createNewOfficer() {
        System.out.println("Create new officer menu\n" +
                "1.Add new Engineering\n" +
                "2.Add new Worker\n" +
                "3.Add new Employee\n" +
                "4.Back to Main menu\n" +
                "0.Exit");
        int choiceCreateMenu;
        do {
            System.out.println("Enter you choice");
            choiceCreateMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceCreateMenu) {
                case 1:
                    addNewEngineering();
                    break;
                case 2:
                    addNewWorker();
                    break;
                case 3:
                    addNewEmployee();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter again");
            }
        } while (choiceCreateMenu != 0);
    }

    private void addNewEmployee() {
        String[] employeeInfo = addOfficer();
        String employment = scanner.nextLine();
        employeeInfo[4] = employment;
        Employee employee = new Employee();
        officerList.add(employee);
    }

    private void addNewWorker() {
        String[] workerInfo = addOfficer();
        String level = scanner.nextLine();
        workerInfo[4] = level;
        Worker worker = new Worker();
        officerList.add(worker);
    }

    private void addNewEngineering() {
        String[] engineeringInfo = addOfficer();
        String trainingIndustry = scanner.nextLine();
        engineeringInfo[4] = trainingIndustry;
        Engineering engineering = new Engineering(engineeringInfo);
        officerList.add(engineering);
    }

    public String[] addOfficer() {
        System.out.println("Enter Officer name");
        String name = scanner.nextLine();
        System.out.println("Enter Officer birth day");
        String birthDay = scanner.nextLine();
        System.out.println("Enter Officer gender");
        String gender = scanner.nextLine();
        System.out.println("Enter Officer address");
        String address = scanner.nextLine();
        System.out.println("Enter Officer training industry");
        String[] strings = {name, birthDay, gender, address, null};
        return strings;
    }
}
