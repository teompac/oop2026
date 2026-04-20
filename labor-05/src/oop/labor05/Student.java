package oop.labor05;

public class Student {
    private String ID,lastName,firstName;
    public Student(String ID,String lastName,String firstName){
        this.ID=ID;
        this.lastName=lastName;
        this.firstName=firstName;
    }

    public String getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
