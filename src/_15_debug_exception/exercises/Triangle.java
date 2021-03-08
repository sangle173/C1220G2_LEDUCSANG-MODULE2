package _15_debug_exception.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static double[] inputTriangleSides() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Enter triangle edge a: ");
            a = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter triangle edge b: ");
            b = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter triangle edge c: ");
            c = Double.parseDouble(scanner.nextLine());
            if (a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("Length of triangle edge need to greater 0.");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException("Sum of 2 edge need to greater other edge.");
            }
        } catch (InputMismatchException e) {
            throw new IllegalTriangleException("Length of edge need to be a number");
        }
        return new double[]{a, b, c};
    }

    public static void main(String[] args) {
        try {
            double[] sides = inputTriangleSides();
            System.out.print("Three of triangle edge is: ");
            for (double edge : sides) {
                System.out.print(edge + " ");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
