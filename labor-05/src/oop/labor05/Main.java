package oop.labor05;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
//        for (Course c : courses) {
//            System.out.println(c);
//        }
        ArrayList<Student> students = readStudents("students.csv");
//        for(Student s: students){
//            System.out.println(s);
//        }
    }
    public static ArrayList<Course> readCourses(String filename){
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(",");
                String name = items[0].trim();
                String description = items[1].trim();
                int numHours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name,description,numHours));
            }
        }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
        return courses;
    }
    public static ArrayList<Student> readStudents(String fileName) {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String ID = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                students.add(new Student(ID,firstName,lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
