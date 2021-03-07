package _14_sort_algorithm.practises;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        selectionSort(list);
        for (double v : list) {
            System.out.print(v + "\t");
        }
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[minIndex] > list[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                double temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }
}
