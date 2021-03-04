package _03_arrays_method.practises;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not great than 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Display arrays");
        for (int element : arr) {
            System.out.print(element + "\t");
        }
        System.out.println("\n==============================");
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp;
        }
        System.out.println("Array after reversed: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
