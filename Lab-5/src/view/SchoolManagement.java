package view;

import model.School;
import model.Student;


import java.util.List;
import java.util.Scanner;

public class SchoolManagement extends Menu {
    private final School school;

    public SchoolManagement(School school) {
        this.school = school;
    }


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("School Management System");
            System.out.println("1. List all Students");
            System.out.println("2. Student Search");
            System.out.println("3. Add new Student");
            System.out.println("4. Sorting display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    List<Student> students = school.getStudents();
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        school.printStudents(students);
                    }
                    break;
                case 2:
                    searchMenu();
                    break;
                case 3:
                    school.addStudentFromConsole();
                    break;
                case 4:
                    sortMenu();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    private void searchMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Student Search Menu");
            System.out.println("1. Search by name");
            System.out.println("2. Search by ID");
            System.out.println("3. Back to main menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    List<Student> studentsByName = school.searchByName(name);
                    if (studentsByName.isEmpty()) {
                        System.out.println("No students found with name: " + name);
                    } else {
                        school.printStudents(studentsByName);
                    }
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    Student studentById = school.searchById(id);
                    if (studentById == null) {
                        System.out.println("No student found with ID: " + id);
                    } else {
                        System.out.println(studentById);
                    }
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }

    private void sortMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Sort Student Menu");
            System.out.println("1. Sort by name");
            System.out.println("2. Sort by ID");
            System.out.println("3. Sort by average");
            System.out.println("4. Back to main menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    school.sortByName();
                    System.out.println("Students sorted by name (ascending)!");
                    break;
                case 2:
                    school.sortById();
                    System.out.println("Students sorted by ID (ascending)!");
                    break;
                case 3:
                    school.sortByAverageDescending();
                    System.out.println("Students sorted by average (descending)!");
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}

