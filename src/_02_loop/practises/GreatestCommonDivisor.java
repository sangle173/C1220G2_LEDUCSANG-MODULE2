package _02_loop.practises;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No have greatest common divisor");
        } else {
            while (a != b) {
                if (a > b)
                    a -= b;
                else
                    b -= a;
            }
        }
        System.out.println("The greatest common divisor is " + a);
    }

}
