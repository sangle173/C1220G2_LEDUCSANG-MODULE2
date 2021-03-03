package _03_arrays_method.exercises;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] arr;
        do {
            System.out.println("Enter size");
            n = scanner.nextInt();
            if (n > 20)
                System.out.println("Size does not great than 20");
        } while (n > 20);
        arr = new int[n];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Before delete");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println("\nEnter key");
        int key = scanner.nextInt();
        int c = deleteElement(arr, n, key);
        System.out.println("After delete " + key);
        for (int j = 0; j < c; j++) {
            System.out.print(arr[j] + "\t");
        }

    }

    public static int deleteElement(int[] arr, int n, int key) {
        int pos = searchElement(arr, key);
        if (pos == -1)
            System.out.println("Not found Please try again");
        else {
            for (int j = pos; j < n - 1; j++) {
                int temp;
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        return n - 1;
    }

    public static int searchElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
