package _03_arrays_method.exercises;

import java.util.Scanner;

public class FindChartInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = scanner.next();
        System.out.println(str);
        System.out.println("Enter a char you are looking in string");
        char key = scanner.next().charAt(0);
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==key){
                count++;
            }
        }
        System.out.println("the number of occurrences " + key + " in string is " + count);
    }
}
