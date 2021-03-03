package _03_arrays_method.practises;

import java.util.Scanner;

public class FindMaxValueInArrays {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("size should be less than 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter the element " + (i + 1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int arr : array) {
            System.out.print(arr + "\t");
        }
        int maxArr = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > maxArr) {
                maxArr = array[j];
                index++;
            }
        }
        System.out.println("\nThe max value of arrays is " + maxArr + " at index " + index);
    }
}
