package _03_arrays_method.practises;

import java.util.Scanner;

public class FindValueInArrays {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name you want to find");
        String name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("The name you looking " + name + " is available at: " + (i + 1)+" in the list");
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Not found " + "'"+name+"'" + " in the list");
    }
}
