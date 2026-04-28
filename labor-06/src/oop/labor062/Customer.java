package oop.labor062;

import java.util.ArrayList;

public class Customer {
    private static int numCustomer;
    private int id;
    private String firstName,lastName;
    private ArrayList <BankAccount> accounts = new ArrayList<>();
    public Customer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public int getNumCustomer() {
        return numCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<BankAccount> getAccount() {
        return accounts;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }
//    public void closeAccount(String account){
//        String temp = getAccount();
//        if(this.accounts.equals(temp)){
//        }
}

