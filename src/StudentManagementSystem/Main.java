package StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Student Management System");

        //CRUD

        System.out.println("\nWhat are the operations you can perform?");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Find Student");
        System.out.println("5. Find All Students");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice:");
        int choice=Integer.parseInt(scanner.nextLine());
        if (choice==1) {
            System.out.println("Enter Student Name:");
            String studentName = scanner.nextLine();
            System.out.println("Enter Roll No:");
            String rollNo = scanner.nextLine();
            System.out.println("Enter Class Code:");
            String classCode = scanner.nextLine();
            System.out.println("Enter Grade:");
            char grade = scanner.nextLine().charAt(0);
            System.out.println("Enter Age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Address:");
            String address = scanner.nextLine();

            Student student = new Student();
            student.setStudentName(studentName);
            student.setRollNo(rollNo);
            student.setClassCode(classCode);
            student.setGrade(grade);
            student.setAge(age);
            student.setAddress(address);
        }

        else if (choice==2) {
            System.out.println("Enter Student Name:");
            String studentName = scanner.nextLine();
            System.out.println("Enter Roll No:");
            String rollNo = scanner.nextLine();
            System.out.println("Enter Class Code:");
            String classCode = scanner.nextLine();
            System.out.println("Enter Grade:");
            char grade = scanner.nextLine().charAt(0);
            System.out.println("Enter Age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Address:");
            String address = scanner.nextLine();
            Student student = new Student();
            student.setStudentName(studentName);
            student.setRollNo(rollNo);
            student.setClassCode(classCode);
            student.setGrade(grade);
            student.setAge(age);
            student.setAddress(address);
        }
        else if (choice==3) {
            System.out.println("Enter Student Name:");
            String studentName = scanner.nextLine();
            System.out.println("Enter Roll No:");
            String rollNo = scanner.nextLine();
            System.out.println("Enter Class Code:");
            String classCode = scanner.nextLine();
            System.out.println("Enter Grade:");
            char grade = scanner.nextLine().charAt(0);
            System.out.println("Enter Age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Address:");
            String address = scanner.nextLine();
            Student student = new Student();
            student.setStudentName(studentName);
            student.setRollNo(rollNo);
            student.setClassCode(classCode);
            student.setGrade(grade);
            student.setAge(age);
            student.setAddress(address);

        }


    }
}
