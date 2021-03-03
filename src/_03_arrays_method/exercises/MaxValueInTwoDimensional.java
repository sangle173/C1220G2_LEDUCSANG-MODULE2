package _03_arrays_method.exercises;

import java.util.Scanner;

public class MaxValueInTwoDimensional {
    public static void main(String[] args) {
        // khai báo số dòng và số cột của ma trận
        int m, n;

        int[][] A;
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter number of rows : ");
            m = scanner.nextInt();
            System.out.println("Enter number of columns: ");
            n = scanner.nextInt();

            // khai báo ma trận A có m dòng, n cột
            A = new int[m][n];

            System.out.println("Enter the element for Matrix list: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = scanner.nextInt();
                }
            }
        }

        // tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }

        System.out.println("The max value in Matrix is = " + max);
    }
}
