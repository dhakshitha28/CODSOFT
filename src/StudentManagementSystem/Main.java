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

            System.out.println("\n What are the operations you can perform?");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Find All Students");


            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter your choice to perform the task:");
            int choice = Integer.parseInt(scanner.nextLine());
            StudentManagement sm = new StudentManagement();

            if (choice == 1) {
               sm.addStudent(studentList, scanner);
            }

            else if (choice == 2) {
               sm.updateStudent(studentList, scanner);
            }
           else  if (choice == 3) {
                sm.deleteStudent(studentList, scanner);
            }

           else if (choice == 4) {
                sm.findAllStudents(studentList);
            }

            else{
                System.out.println("Invalid Choice");
            }
        }
    }
}
