package _12_collection_framework.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        displayMain();
    }

    public static void displayMain() {
        System.out.println("Menu : \n" +
                "1.Add new product \n" +
                "2.Show all product \n" +
                "3.Edit product with id \n" +
                "4.Delete product with key \n" +
                "5.Search product with name \n" +
                "6.Sort product list \n" +
                "0.Exit");
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your choice demo.Main");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayMenuAddProduct();
                    break;
                case 2:
                    FuncProduct.showAllProduct();
                    break;
                case 3:
                    displayMenuEdit();
                    break;
                case 4:
                    displayMenuDelete();
                    break;
                case 5:
                    displayMenuSearch();
                    break;
                case 6:
                    displayMenuSort();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }
        } while (choice != 0);
    }

    public static void displayMenuSearch() {
        System.out.println("1.Enter name your want to Search \n" +
                "2.Back to demo.Main Menu \n" +
                "0.Exit");
        int choiceSearch;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your choice Menu Search");
            choiceSearch = Integer.parseInt(scanner.nextLine());
            switch (choiceSearch) {
                case 1:
                    System.out.println("Enter name your want to Search");
                    String nameSearch;
                    nameSearch = scanner.nextLine();
                    searchProductWithName(nameSearch);
                    break;
                case 2:
                    displayMain();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }
        } while (choiceSearch != 0);
    }

    public static void displayMenuDelete() {
        System.out.println("1.Enter id your want to delete \n" +
                "2.Back to demo.Main Menu \n" +
                "0.Exit");
        int choiceDelete;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your choice Menu Delete");
            choiceDelete = Integer.parseInt(scanner.nextLine());
            switch (choiceDelete) {
                case 1:
                    System.out.println("Enter id your want to delete");
                    String idDelete;
                    idDelete = scanner.nextLine();
                    deleteProductWithId(idDelete);
                    break;
                case 2:
                    displayMain();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }
        } while (choiceDelete != 0);
    }

    public static void displayMenuEdit() {
        System.out.println("1.Enter id your want to edit \n" +
                "2.Back to demo.Main Menu \n" +
                "0.Exit");
        int choiceEdit;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your choice Menu Edit");
            choiceEdit = Integer.parseInt(scanner.nextLine());
            switch (choiceEdit) {
                case 1:
                    System.out.println("Enter id your want to delete");
                    String idEdit;
                    idEdit = scanner.nextLine();
                    editProductWithId(idEdit);
                    break;
                case 2:
                    displayMain();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }
        } while (choiceEdit != 0);
    }

    public static void displayMenuSort() {
        System.out.println("1.Sort ascending type \n" +
                "2.Sort decreasing type \n" +
                "3.Back to demo.Main Menu \n" +
                "0.Exit");
        int choiceSortType;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your choice Menu Sort Type");
            choiceSortType = Integer.parseInt(scanner.nextLine());
            switch (choiceSortType) {
                case 1:
                    FuncProduct.sortAscending();
                    break;
                case 2:
                    FuncProduct.sortDecreasing();
                    break;
                case 3:
                    displayMain();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }
        } while (choiceSortType != 0);
    }


    public static void deleteProductWithId(String idDelete) {
        List<Product> list = FuncProduct.readFromFile();
        for (Product product : list) {
            if (product.getId().equals(idDelete)) {
                list.remove(product);
                FuncProduct.writeFile(list, false);
                System.out.println("Your select already deleted");
                return;
            }
        }
        System.out.println(idDelete + " not have in product list");
    }

    public static void displayMenuAddProduct() {
        System.out.println("1.Add new product with id and name \n" +
                "2.Back to demo.Main menu \n" +
                "0.Exit");
        Scanner scanner = new Scanner(System.in);
        int choiceAddProduct;
        do {
            choiceAddProduct = Integer.parseInt(scanner.nextLine());
            switch (choiceAddProduct) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayMain();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }
        } while (choiceAddProduct != 0);
    }

    public static void addProduct() {
        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        System.out.println("Enter id");
        id = scanner.nextLine();
        System.out.println("Enter product name");
        name = scanner.next();
        productList.add(new Product(id, name));
        FuncProduct.writeFile(productList, true);
        displayMenuAddProduct();
    }

    public static void searchProductWithName(String name) {
        List<Product> list = FuncProduct.readFromFile();
        for (Product product : list) {
            if (product.getName().equals(name)) {
                System.out.println("Product your want to show: " + product);
                return;
            }
        }
        System.out.println(name + " not have in product list");
    }

    public static void editProductWithId(String idEdit) {
        Scanner scanner = new Scanner(System.in);
        List<Product> list = FuncProduct.readFromFile();
        for (Product product : list) {
            if (product.getId().equals(idEdit)) {
                list.remove(product);
                System.out.println("Enter new name of product");
                String newName = scanner.nextLine();
                list.add(new Product(idEdit, newName));
                FuncProduct.writeFile(list, false);
                System.out.println("Your select already change");
                return;
            }
        }
        System.out.println(idEdit + " don't have in product list");
    }
}
