package _01_java_introduction.exercises;

import java.util.Scanner;

public class ConvertCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of USD");
        double usd = scanner.nextDouble();
        final double rateVndUsd = 23000;
        System.out.println("Value of Vnd converted is : " + usd * rateVndUsd);
    }

}
