package lab10_3;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static void main() {
//        ArrayList<Employee> employee = new ArrayList<>();
        Company company = new Company("At");
        company.hireAll("employees.csv");
        company.printAll(System.out);
        System.out.println("Alphabetically: ");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getFirstName().equals(e2.getFirstName())) {
                    return e1.getFirstName() - e2.getFirstName();
                }
            }
        });
        company.printAll(System.out);

    }
}
