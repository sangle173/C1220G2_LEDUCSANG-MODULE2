package _18_string_regex.practises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX ="^[_a-z0-9]{6,}$";
    public AccountExample(){

    }
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountExample accountExample = new AccountExample();
        System.out.println("Enter a account");
        String account = scanner.nextLine();
        System.out.println(accountExample.validate(account));
    }
}
