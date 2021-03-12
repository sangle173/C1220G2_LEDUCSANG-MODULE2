package _18_string_regex.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        while (true) {
            System.out.println("Enter phone number");
            String string = scanner.nextLine();
            if (pattern.matcher(string).find()) {
                System.out.println("Phone number is ok");
                break;
            } else {
                System.err.println("Phone number is not oke");
            }
        }
    }
}
