package oop.labor08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank OTP = new Bank("OTP");
        Customer customer1 = new Customer ("Teompa","Krisztian");
        Customer customer2 = new Customer ("Kis","Pista");
        customer1.addAccount(new CheckingAccount(2000));
        customer1.addAccount(new SavingsAccount(0.3));
        customer2.addAccount(new CheckingAccount(4000));
        customer2.addAccount(new SavingsAccount(0.7));
        OTP.addCustomer(customer1);
        OTP.addCustomer(customer2);
        for (String num : customer1.getAccountNumbers()) {
            customer1.getAccount(num).deposit(5000);
        }
        for (String num : customer2.getAccountNumbers()) {
            customer2.getAccount(num).deposit(10000);
        }
        OTP.printCustomersToStdout();
        for(BankAccount acc: customer1.getAccount()){
            if(acc instanceof SavingsAccount){
                ((SavingsAccount) acc).setInterestRate();
            }
        }
    }
}
