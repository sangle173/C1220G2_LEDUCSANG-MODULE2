package _03_arrays_method.exercises;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] arr;
        // kiểm tra sô phần tử không quá 20
        do {
            System.out.println("Enter size");
            n = scanner.nextInt();
            if (n > 20)
                System.out.println("Size does not great than 20");
        } while (n > 20);
        // khai báo danh sách số nguyên với độ dài bằng n nhập vào
        arr = new int[n];
        // nhập vào các phần tử từ bàn phím
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        // khai báo một mảng mới để lưu danh sách các số nguyên sau khi được chèn, có chiều dài lớn hơn mảng cũ 1 đơn vị
        int[] arrNew = new int[arr.length + 1];
        // in ra mảng trước khi chèn
        System.out.println("Before insert");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        // sao chép mảng cũ vào mảng mới
        for (int j = 0; j < arr.length; j++) {
            arrNew[j] = arr[j];
        }
        //nhập số muốn chèn
        System.out.println("\nEnter the key you want to insert to list");
        int key = scanner.nextInt();
        // nhập vị trí muốn chèn
        System.out.println("Enter the index of list you want to insert");
        int pos = scanner.nextInt();
        // dời các phần tử sau vị trí muốn chèn
        for (int j = n; j > pos - 1; j--) {
            arrNew[j] = arrNew[j - 1];
        }
        // gán số muốn chèn vào vị trí muốn chèn
        arrNew[pos - 1] = key;
        //in ra mảng mới sau khi chèn
        System.out.println("Before insert");
        for (int num :
                arrNew) {
            System.out.print(num + " ");
        }
    }
}
