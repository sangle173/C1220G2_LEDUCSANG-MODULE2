package _02_loop.practises;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money");
        double money = scanner.nextDouble();
        System.out.println("Enter month");
        byte month = scanner.nextByte();
        System.out.println("Enter interest rate");
        double interestRate = scanner.nextDouble();
        double totalMoneyInterest = 0.0000;
        for (int i = 0; i < month; i++) {
            totalMoneyInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("total money interest is " + totalMoneyInterest);
    }
}
