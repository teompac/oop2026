package oop.labor04.lab4_2;

import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<Customer> customers = readFromCSVFile("lab4_2_input.csv");
        System.out.println("*****");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                if (line.startsWith("Customer")) {
                    System.out.println("This is a customer");
                    String[] items = line.split(",");
                    Customer c = new Customer(items[1].trim(), items[2].trim());
                    customers.add(c);
                } else if(line.startsWith("Account")){
                    System.out.println("This is a bank account");
                    String[] items = line.split(",");
                    String accNum = items[1].trim();
                    double bal = Double.parseDouble(items[2].trim());
                    BankAccount c = new BankAccount(accNum,bal);
                    accounts.add(c);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
