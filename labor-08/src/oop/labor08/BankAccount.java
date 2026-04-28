package oop.labor08;

public class BankAccount {
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;
    private final String accountNumber;
    private double balance;

    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    private String createAccountNumber() {
        String AccountNumber=PREFIX;
        String numberSTR=String.valueOf(numAccounts);
        for(int i=PREFIX.length();i<=ACCOUNT_NUMBER_LENGTH-numberSTR.length();i++){
            AccountNumber = AccountNumber + 0;
        }
        return AccountNumber + numAccounts;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public boolean withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}


