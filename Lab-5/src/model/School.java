package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class School {
    private final List<Student> students;
// constructor
    public School() {
        students = new ArrayList<>();
    }
//get method
    public List<Student> getStudents() {
        return students;
    }
// methods
    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> searchByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public Student searchById(int id) {
        for (int i = 0; i< students.size();i++) {
            if (students.get(i).getID() == id) {
                return students.get(i);
            }
        }
        return null;
    }

    public void printStudents(List<Student> students) {
        for (int i = 0; i< students.size();i++) {
            System.out.println(students.get(i));
        }
    }

    public void addStudentFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student average: ");
        double average = scanner.nextDouble();
        Student student = new Student(id, name, average);
        addStudent(student);
        System.out.println("Student added successfully!");
    }

//   lamda expression

    public void sortByName() {

        Collections.sort(students, ((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName())));
        for (int i = 0; i<students.size();i++){
            System.out.println(students.get(i));
        }
    }

    public void sortById() {

        Collections.sort(students, (o1, o2) -> Integer.compare(o1.getID(), o2.getID()));
        for (int i = 0; i<students.size();i++){
            System.out.println(students.get(i));
        }
    }

    public void sortByAverageDescending() {

        Collections.sort(students, (o1, o2) -> Double.compare(o2.getAverage(), o1.getAverage()));
        for (int i = 0; i<students.size();i++){
            System.out.println(students.get(i));
        }
    }
//comparator.comparing

//    public void sortByName() {
//        Comparator<Student> comparator = Comparator.comparing(Student::getName);
//        Collections.sort(students, comparator);
//        for (int i = 0; i<students.size();i++){
//            System.out.println(students.get(i));
//        }
//    }
//
//    public void sortById() {
//        Comparator<Student> comparator = Comparator.comparingInt(Student::getID);
//        Collections.sort(students, comparator);
//        for (int i = 0; i<students.size();i++){
//            System.out.println(students.get(i));
//        }
//    }
//
//    public void sortByAverageDescending() {
//        Comparator<Student> comparator = Comparator.comparingDouble(Student::getAverage).reversed();
//        Collections.sort(students, comparator);
//        for (int i = 0; i<students.size();i++){
//            System.out.println(students.get(i));
//        }
//    }

}
