package _11_dsa_stac_queue.optional.exercises.to_binary_string;

import java.util.Scanner;
import java.util.Stack;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("USED METHOD toBinaryString ");
        System.out.println("Binary of 124 is: " + Integer.toBinaryString(124));
        System.out.println("Binary of 182 is: " + Integer.toBinaryString(182));
        System.out.println("Binary of 1231 is: " + Integer.toBinaryString(1231));
        System.out.println("Binary of 9 is: " + Integer.toBinaryString(9));

        System.out.println("USED MY SETTING");
        TestMain obj = new TestMain();
        System.out.print("Binary of 124 is :");
        obj.convertToBinary(124);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number1;
        number1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Binary of " + number1 + " is:");
        obj.convertToBinary(number1);
        System.out.println();

        System.out.println("-------------------------------------");

        System.out.println("USED STACK");
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter a integer number");
        int number2;
        number2 = Integer.parseInt(scanner.nextLine());
        while (number2 != 0) {
            int d = number2 % 2;
            stack.push(d);
            number2 /= 2;
        }
        System.out.print("Binary of " + number2 + " is:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public void convertToBinary(int number) {
        int[] binary = new int[40];
        int index = 0;
        while (number > 0) {
            binary[index++] = number % 2;
            number = number / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
