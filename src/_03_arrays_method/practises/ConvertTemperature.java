package _03_arrays_method.practises;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        int choice;
        double f;
        double c;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    f = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fToC(f));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    c = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cToF(c));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    public static double cToF(double c) {
        return (9.0 / 5) * c + 32;
    }

    public static double fToC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
