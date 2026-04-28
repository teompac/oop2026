package oop.labor08;

import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public int numCustomers() {
        return customers.size();
    }

    private void printCustomers( PrintStream ps ) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ) {
            ps.println( customer.getId()+", " + customer.getFirstName() + ", "+
                    customer.getLastName()+", "+customer.getNumAccount());
        }
    }
    public void printCustomersToStdout() {
        printCustomers( System.out );
    }
    public void printCustomersToFile( String filename ) {
        try (PrintStream out = new PrintStream(filename)) {
            printCustomers(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

