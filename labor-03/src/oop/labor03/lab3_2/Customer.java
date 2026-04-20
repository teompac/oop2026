package oop.labor03.lab3_2;
import oop.labor03.lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;

    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(String accountNumber) {
        for(int i=0;i<numAccounts;i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void addAccount(BankAccount account) {
        if(numAccounts<MAX_ACCOUNTS) {
            accounts[numAccounts] = account;
            numAccounts++;
        }
    }

    public void closeAccount(String accountNumber) {
//        this.account = null;
//        megkeresed accNumber szerint, kitorlod majd az utolsot a helyere masolod
    }

    @Override
    public String toString() {
        String result = firstName + " " + lastName + " accounts:\n";
        for(int i=0;i<numAccounts;i++) {
            result += "\t" + accounts[i].toString() + "\n";
        }
        return result;
    }
}