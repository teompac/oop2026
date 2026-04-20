package oop.labor05;

import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDate startDate, endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public Course getCourse() {
        return course;
    }

    public Student findStudentByID(String ID1) {
        for (Student s : enrolledStudents) {
            if (s.getID().equals(ID1)) {
                return s;
            }
        }
        return null;
    }
}