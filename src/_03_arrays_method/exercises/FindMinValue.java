package _03_arrays_method.exercises;

import java.util.Scanner;

public class FindMinValue {
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
        System.out.println("\nMin value in list is : " + minValue(arr));
    }

    public static int minValue(int[] array) {
        int minArr = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minArr) {
                minArr = array[i];
            }
        }
        return minArr;
    }
}
