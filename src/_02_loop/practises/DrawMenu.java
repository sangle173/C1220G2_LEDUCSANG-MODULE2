package _02_loop.practises;

import java.util.Scanner;

public class DrawMenu {
    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    public static String repeat(int count) {
        return repeat(count, " ");
    }


    public static void main(String[] args) {


        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        do {
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 6; i > 0; i--) {
                        System.out.println(repeat(i, "*"));
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 6; i++) {
                        System.out.println("*******");
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("*******");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try another number");
            }
        }while (choice!=0);
    }
}
