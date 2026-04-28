package oop.labor08;

import java.util.ArrayList;

public class Customer {
    private static int numCustomer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++numCustomer;
    }

    public int getId() {
        return id;
    }

    public int getNumAccount() {
        return accounts.size();
    }

    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> numbers = new ArrayList<>();
        for (BankAccount acc : accounts) {
            numbers.add(acc.getAccountNumber());
        }
        return numbers;
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
                accounts.remove(i);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Customer: " + id + ", " + firstName + " " + lastName + ", accounts: " + accounts.size();
    }
}