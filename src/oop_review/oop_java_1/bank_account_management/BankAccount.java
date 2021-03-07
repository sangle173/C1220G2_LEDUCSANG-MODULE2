package oop_review.oop_java_1.bank_account_management;

public class BankAccount {
    private static final float RATE = 0.035f;
    private static final float FEE_TRANSFER = 7000f;
    private long accountNumber;
    private String accountName;
    private double accountBalance;

    public BankAccount() {
    }

    public BankAccount(long accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public BankAccount(long accountNumber, String accountName) {
        this.accountBalance = 50000;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void paymentToAccount(double moneyPayment) {
        this.accountBalance += moneyPayment;
    }

    public void withdrawalFromAccount(double moneyWithdrawal) {
        this.accountBalance -= moneyWithdrawal;
    }

    public void getExpired() {
        this.accountBalance = this.accountBalance + this.accountBalance * RATE;
    }

    public void transferToOther(BankAccount bankAccount, double moneyTransfer) {
        bankAccount.accountBalance = bankAccount.accountBalance + moneyTransfer;
        this.accountBalance = this.accountBalance - moneyTransfer - FEE_TRANSFER;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
