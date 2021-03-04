package _13_search_algorithms.practises;

public class BinarySearchTree {
    static int[] list = {2, 3, 4, 5, 7, 8, 12, 13, 15, 19, 20, 30, 40, 69, 312};

    static int binarySearchTree(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearchTree(list, 2));
        System.out.println(binarySearchTree(list, 3));
        System.out.println(binarySearchTree(list, 90));
    }
}
