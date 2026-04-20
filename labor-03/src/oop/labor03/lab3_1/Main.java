package oop.labor03.lab3_1;

import java.awt.image.BandCombineOp;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Teompa","Cristian");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("BT1",1000));
        System.out.println(customer1);
        customer1.getAccount().deposit(2000);
        System.out.println(customer1);

        Customer customer2 = new Customer("White","Mary");
        customer2.setAccount(new BankAccount("BT2"));
        System.out.println(customer2);
        customer2.getAccount().deposit(2000);
        System.out.println((customer2));
        Customer customer3 = new Customer("White","Mary");
    }
}
