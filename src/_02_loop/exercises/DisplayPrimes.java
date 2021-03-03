package _02_loop.exercises;

import java.util.Scanner;

public class DisplayPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < num) {
            if (checkPrimes(n)){
                count++;
                System.out.println(n);
            }
            n++;
        }
    }

    public static boolean checkPrimes(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
