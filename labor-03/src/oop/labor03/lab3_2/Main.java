package oop.labor03.lab3_2;
import java.util.Random;
import oop.labor03.lab3_1.BankAccount;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Customer customer1 = new Customer("Teompa", "Cristian");
        System.out.println(customer1);
        for(int i=0;i<5;i++)
        customer1.addAccount(new BankAccount("ACC"+i,rand.nextInt(10000)));
        System.out.println(customer1);
        Customer customer2 = new Customer("Kis", "Pista");
        for(int i=0;i<9;i++)
            customer2.addAccount(new BankAccount("ACC"+i,1000));
        System.out.println(customer2);

    }
}