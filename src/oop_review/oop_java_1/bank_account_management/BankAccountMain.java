package oop_review.oop_java_1.bank_account_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountMain {
    Scanner scanner = new Scanner(System.in);
    List<BankAccount> bankAccountList = new ArrayList<>();
    BankAccount bankAccount1 = new BankAccount(1234568, "Account1", 10000000);
    BankAccount bankAccount2 = new BankAccount(1234567, "Account2");
    BankAccount bankAccount3 = new BankAccount(1234569, "Account3");

    public static void main(String[] args) {
        BankAccountMain bankAccountMain = new BankAccountMain();
        bankAccountMain.displayMainMenu();
    }

    public void displayMainMenu() {
        bankAccountList.add(bankAccount1);
        bankAccountList.add(bankAccount2);
        bankAccountList.add(bankAccount3);
        System.out.println("Main Menu\n" +
                "1.Check account available balance\n" +
                "2.Payment to account\n" +
                "3.Withdrawal from account\n" +
                "4.Expired from account\n" +
                "5.Transfer to other account\n" +
                "0.Exit");
        int choice;
        do {
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    checkBalance(bankAccountList);
                    break;
                case 2:
                    paymentToAccount(bankAccountList);
                    break;
                case 3:
                    withdrawalFromAccount(bankAccountList);
                    break;
                case 4:
                    expiredFromAccount(bankAccountList);
                    break;
                case 5:
                    transferToOtherAcc(bankAccountList);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
            }
        } while (choice != 0);
    }

    private void transferToOtherAcc(List<BankAccount> bankAccountList) {
        System.out.println("Enter account number transfer");
        long accountNumberTransfer = Long.parseLong(scanner.nextLine());
        int indexAccountTransfer = checkAccountAvailable(bankAccountList, accountNumberTransfer);
        if (indexAccountTransfer != -1) {
            System.out.println("Enter account number to transfer");
            long accountNumberToTransfer = Long.parseLong(scanner.nextLine());
            int indexAccountToTransfer = checkAccountAvailable(bankAccountList, accountNumberToTransfer);
            if (indexAccountToTransfer != -1 && indexAccountToTransfer != indexAccountTransfer) {
                System.out.println("Enter money you want to transfer");
                double moneyTransfer = Double.parseDouble(scanner.nextLine());
                if (moneyTransfer <= 0 || moneyTransfer > bankAccountList.get(indexAccountTransfer).getAccountBalance()) {
                    System.out.println("The money of transfer need to less than of account transfer or greatest 0");
                } else {
                    bankAccountList.get(indexAccountTransfer).transferToOther(bankAccountList.get(indexAccountToTransfer), moneyTransfer);
                    System.out.println("The account number " + accountNumberTransfer + " after transfer is: " + bankAccountList.get(indexAccountTransfer));
                    System.out.println("The account number to transfer " + accountNumberToTransfer + " after transfer is: " + bankAccountList.get(indexAccountToTransfer));
                }
            } else {
                System.out.println("Your account number not available");
            }
        } else {
            System.out.println("Your account number not available");
        }
    }

    private void expiredFromAccount(List<BankAccount> bankAccountList) {
        System.out.println("Enter the account you want to payment");
        long accountNumber = Long.parseLong(scanner.nextLine());
        int indexAccount = checkAccountAvailable(bankAccountList, accountNumber);
        if (indexAccount != -1) {
            System.out.println("Enter the money you want to payment");
            bankAccountList.get(indexAccount).getExpired();
            System.out.println("Your selection already done\n" +
                    "The account after payment\n" + bankAccountList.get(indexAccount));
        } else {
            System.out.println("The " + accountNumber + " not available");
        }

    }

    private void withdrawalFromAccount(List<BankAccount> bankAccountList) {
        System.out.println("Enter account number you want to withdrawal");
        long accountNumber = Long.parseLong(scanner.nextLine());
        int indexAccount = checkAccountAvailable(bankAccountList, accountNumber);
        if (indexAccount != -1) {
            boolean check = false;
            do {
                System.out.println("Enter the moneys you want to withdrawal");
                double moneyWithdrawal = Double.parseDouble(scanner.nextLine());
                if (moneyWithdrawal <= 0 || moneyWithdrawal > bankAccountList.get(indexAccount).getAccountBalance()) {
                    System.out.println("Please enter the money of withdrawal greatest 0 and let than " + accountNumber + " balance");
                } else {
                    bankAccountList.get(indexAccount).withdrawalFromAccount(moneyWithdrawal);
                    System.out.println("Your selection already done\n" +
                            "Account " + accountNumber + " after withdrawal\n" + bankAccountList.get(indexAccount));
                }
            } while (check);
        } else {
            System.out.println("Your account number not available");
        }
    }

    private void checkBalance(List<BankAccount> bankAccountList) {
        System.out.println("Enter your account number");
        long accountNumber = Long.parseLong(scanner.nextLine());
        int indexAccount = checkAccountAvailable(bankAccountList, accountNumber);
        if (indexAccount != -1) {
            System.out.println(bankAccountList.get(indexAccount));
        } else {
            System.out.println("The " + accountNumber + " not available");
        }
    }

    public void paymentToAccount(List<BankAccount> bankAccountList) {
        System.out.println("Enter the account you want to payment");
        long accountNumber = Long.parseLong(scanner.nextLine());
        int indexAccount = checkAccountAvailable(bankAccountList, accountNumber);
        if (indexAccount != -1) {
            System.out.println("Enter the money you want to payment");
            double moneyPayment = Double.parseDouble(scanner.nextLine());
            bankAccountList.get(indexAccount).paymentToAccount(moneyPayment);
            System.out.println("Your selection already done\n" +
                    "The account after payment\n" + bankAccountList.get(indexAccount));
        } else {
            System.out.println("The " + accountNumber + " not available");
        }
    }

    public int checkAccountAvailable(List<BankAccount> bankAccountList, long accountNumber) {
        for (int i = 0; i < bankAccountList.size(); i++) {
            if (bankAccountList.get(i).getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1;
    }
}
