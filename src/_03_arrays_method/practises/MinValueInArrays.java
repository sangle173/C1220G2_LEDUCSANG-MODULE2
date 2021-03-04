package _03_arrays_method.practises;

public class MinValueInArrays {
    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 1, 6, 9, 0};
        for (int a : array) {
            System.out.print(a + "\t");
        }
        int minArr = minValue(array);
        System.out.println("The smallest element in the array is: " + minArr);
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
