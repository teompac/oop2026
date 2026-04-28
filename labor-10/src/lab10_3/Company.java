package lab10_3;

import lab10_2.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee o){
        employees.add(o);
    }
    public void hireAll(String filename){
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                for (int i = 0; i < items.length; i++) {
                    items[i] = items[i].trim();
                }
                String lastName = items[0];
                String firstName = items[1];
                double salary = Double.parseDouble(items[2]);
                int year = Integer.parseInt(items[3]);
                int month = Integer.parseInt(items[4]);
                int day = Integer.parseInt(items[5]);
                MyDate birthDate = new MyDate(day, month, year);
                if (items.length == 7) {
                    String department = items[6];
                    this.employees.add(new Manager(firstName, lastName, salary, birthDate, department));
                } else {
                    this.employees.add(new Employee(firstName, lastName, salary, birthDate));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fire(int o){
        for (Employee employee: employees){
            if(employee.getID()==o){
                employees.remove(o);
                break;
            }
        }
    }
    public void printAll(PrintStream ps){
        for(Employee employee:employees){
            ps.println(employee);
        }
    }
    public void sortByComparator(Comparator<Employee> comp){
        Collections.sort(employees, comp);
    }
}
