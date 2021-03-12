package _18_string_regex.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassroomName {
    private static final String CLASSROOM_NAME_REGEX = "^[CAP]{1}\\d{4}[GHIKLM]{1}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(CLASSROOM_NAME_REGEX);
        while (true) {
            System.out.println("Enter classroom name");
            String string = scanner.nextLine();
            if (pattern.matcher(string).find()) {
                System.out.println("classroom name is ok");
                break;
            } else {
                System.err.println("classroom name is not oke");
            }
        }
    }
}
