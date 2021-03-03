package _01_java_introduction.exercises;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hundreds = num / 100; // chữ số hàng trăm
        int tens = (num % 100) / 10; // chữ số hàng chục
        int ones = num % 10; // chữ số hàng đơn vị
        // lưu tên để chuyển đôi bắt đầu bằng chuỗi rỗng
        String numberToText = "";
        // tên hàng chục
        String[] tenNames = {
                "",
                " Ten",
                " Twenty",
                " Thirty",
                " forty",
                " Fifty",
                " Sixty",
                " Seventy",
                " Eighty",
                " Ninety"
        };
        //tên hàng số từ 1 đến 19, số 0 là trướng hợp đặc biệt
        String[] numberNames = {
                "",
                " One",
                " Two",
                " Three",
                " Four",
                " Five",
                " Six",
                " Seven",
                " Eight",
                " Nine",
                " Ten",
                " Eleven",
                " Twelve",
                " Thirteen",
                " Fourteen",
                " Fifteen",
                " Sixteen",
                " Seventeen",
                " Eighteen",
                " Nineteen"
        };
        //xét các điều kiện
        if (num < 0 || num > 999) {
            System.out.println("Out of ability");
        } else if (num < 20) {
            if (num == 0) {
                numberToText = "Zero";
            } else {
                numberToText = numberNames[num];
            }
        } else if (num < 100) {
            numberToText = tenNames[tens] + numberNames[ones];
        } else {
            if (ones == 0 && tens == 0) {
                numberToText = numberNames[hundreds] + " Hundred" + tenNames[tens] + numberNames[ones];
            } else if (tens < 2) {
                numberToText = numberNames[hundreds] + " Hundred and " + numberNames[tens * 10 + ones];
            } else {
                numberToText = numberNames[hundreds] + " Hundred and" + tenNames[tens] + numberNames[ones];
            }
        }
        //in ra sau khi chuyển đổi thành từ
        System.out.println(numberToText.trim());
    }
}
