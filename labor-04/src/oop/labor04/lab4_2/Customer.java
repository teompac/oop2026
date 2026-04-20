package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;

    private ArrayList<BankAccount> accounts = new ArrayList<>();

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
        for(int i=0;i<accounts.size();i++) {
            if(accounts.get(i).getAccountNumber().equals(accountNumber)) {
                return accounts.get(i);
            }
        }
        return null;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void closeAccount(String accountNumber) {
//        this.account = null;
//        megkeresed accNumber szerint, kitorlod majd az utolsot a helyere masolod
    }

    @Override
    public String toString() {
        String result = firstName + " " + lastName + " accounts:\n";
        for(int i=0;i<accounts.size();i++) {
            result += "\t" + accounts.get(i).toString() + "\n";
        }
        return result;
    }
}

