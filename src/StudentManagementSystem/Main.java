package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        while (true) {

            System.out.println("Welcome to the Student Management System");


            //CRUD

            System.out.println("\nWhat are the operations you can perform?");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Find Student");
            System.out.println("5. Find All Students");

            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter your choice to perform the task:");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("\n If you want to exist from the Student add task typ EXIT");

                while (true) {

                    System.out.print("Enter Student Name:");
                    String studentName = scanner.nextLine();
                    if (studentName.equals("EXIT")) {
                        throw Exceptions;
                    }
                    System.out.print("Enter Student Roll No:");
                    String rollNo = scanner.nextLine();

                    Student student = null;
                    boolean exists = false;

                    for (Student s : studentList) {

                        if (s.getRollNo().equals(rollNo)) {
                            exists = true;
                            System.out.println("Student Name already exists!");
                            System.out.println("\nStudent Name: " + s.getStudentName());
                            System.out.println("Student Roll No: " + s.getRollNo());
                            System.out.println("Student Class Code: " + s.getClassCode());
                            System.out.println("Student Age: " + s.getAge());
                            System.out.println("Student Grade: " + s.getGrade());
                            System.out.println("Student Address: " + s.getAddress());
                            break;
                        }
                    }

                    if (!exists) {
                        System.out.print("Enter Student class code:");
                        String studentClassCode = scanner.nextLine();
                        System.out.print("Enter Student grade:");
                        String studentGrade = scanner.nextLine();
                        System.out.print("Enter Student age:");
                        String studentAge = scanner.nextLine();
                        System.out.print("Enter Student Address:");
                        String studentAddress = scanner.nextLine();
                        student = new Student(studentName, rollNo, studentClassCode, studentGrade, studentAge, studentAddress);
                        studentList.add(student);

                    }
                }
            }


        }
    }
}
