package _14_sort_algorithm.exercises;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        insertionSort(list);
        for (int value : list) {
            System.out.print(value + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && currentElement < list[j]; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
    }
}
