package _14_sort_algorithm.exercises;

public class InsertionSortByStep {
    static int[] list = {5, 7, 2, 15, 6, 112, -2, 13, 14, 212};

    public static void main(String[] args) {
        System.out.print("Your input list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && currentElement < list[j]; j--) {
                System.out.println("Move " + list[j] + " at index = " + j + " to index = " + (j + 1));
                list[j + 1] = list[j];
            }
            if (j == i - 1) {
                System.out.println(currentElement + " at index = " + (j + 1) + " already sorted");
            } else {
                System.out.println("Insert " + currentElement + " at index = " + (j + 1));
            }
            list[j + 1] = currentElement;
            System.out.print("List after " + i + " times sort: ");
            for (int value : list) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
