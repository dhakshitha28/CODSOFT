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
            System.out.println("4. Find All Students");


            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter your choice to perform the task:");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("\n If you want to exist from the Student add task typ EXIT");

                while (true) {

                    try {
                        System.out.print("Enter Student Name:");
                        String studentName = scanner.nextLine();

                        if (studentName.equals("EXIT")) {
                            throw new Exception();
                        }

                        System.out.print("Enter Student Roll No:");
                        String rollNo = scanner.nextLine();

                        if (rollNo.equals("EXIT")) {
                            throw new Exception();
                        }
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

                            if (studentClassCode.equals("EXIT")) {
                                throw new Exception();
                            }

                            System.out.print("Enter Student grade:");
                            String studentGrade = scanner.nextLine();

                            if (studentGrade.equals("EXIT")) {
                                throw new Exception();
                            }

                            System.out.print("Enter Student age:");
                            String studentAge = scanner.nextLine();

                            if (studentAge.equals("EXIT")) {
                                throw new Exception();
                            }

                            System.out.print("Enter Student Address:");
                            String studentAddress = scanner.nextLine();

                            if (studentAddress.equals("EXIT")) {
                                throw new Exception();
                            }

                            student = new Student(studentName, rollNo, studentClassCode, studentGrade, studentAge, studentAddress);
                            studentList.add(student);

                        }
                    } catch (Exception e) {
                        System.out.println("Successfully Exited from the Student Add Task");
                        break;
                    }
                }
            }

            if (choice == 2) {

                while (true) {

                    System.out.print("Enter Roll No (EXIT to quit): ");
                    String rollNo = scanner.nextLine();

                    if (rollNo.equalsIgnoreCase("EXIT")) {
                        System.out.println("Successfully Exited from Student Update");
                        break;      // Choice 2 exit
                    }

                    Student student = null;

                    for (Student s : studentList) {
                        if (s.getRollNo().equals(rollNo)) {
                            student = s;
                            break;
                        }
                    }

                    if (student == null) {
                        System.out.println("Student not found!");
                        continue;
                    }

                    while (true) {

                        System.out.println("1.Name");
                        System.out.println("2.Class");
                        System.out.println("3.Grade");
                        System.out.println("4.Age");
                        System.out.println("5.Address");
                        System.out.println("6.Completed");

                        int updateChoice = Integer.parseInt(scanner.nextLine());

                        switch (updateChoice) {
                            case 1:
                                System.out.print("New Name: ");
                                student.setStudentName(scanner.nextLine());
                                break;

                            case 2:
                                System.out.print("New Class: ");
                                student.setClassCode(scanner.nextLine());
                                break;

                            case 3:
                                System.out.print("New Grade: ");
                                student.setGrade(scanner.nextLine());
                                break;

                            case 4:
                                System.out.print("New Age: ");
                                student.setAge(scanner.nextLine());
                                break;

                            case 5:
                                System.out.print("New Address: ");
                                student.setAddress(scanner.nextLine());
                                break;

                            case 6:
                                System.out.println("Student Updated Successfully.");
                                break;

                            default:
                                System.out.println("Invalid Choice");
                                continue;
                        }

                        if (updateChoice == 6) {
                            break;   // update menu exit
                        }
                    }
                }
            }
            if (choice == 3) {
                while (true) {

                    try {

                        System.out.print("Enter Student Roll No to Delete (Type EXIT to quit): ");
                        String rollNo = scanner.nextLine();

                        if (rollNo.equalsIgnoreCase("EXIT")) {
                            throw new Exception();
                        }

                        boolean found = false;

                        for (int i = 0; i < studentList.size(); i++) {

                            if (studentList.get(i).getRollNo().equals(rollNo)) {

                                studentList.remove(i);
                                System.out.println("Student deleted successfully.");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student not found.");
                        }

                    } catch (Exception e) {

                        System.out.println("Successfully Exited from Student Delete Task");
                        break;
                    }
                }
            }

            if (choice == 4) {
                for(Student s : studentList) {
                    System.out.println("StudentName"+s.getStudentName());
                    System.out.println("ClassCode"+s.getClassCode());
                    System.out.println("RollNo"+s.getRollNo());
                    System.out.println("Grade"+s.getGrade());
                    System.out.println("Age"+s.getAge());
                    System.out.println("Address"+s.getAddress());
                }
            }
        }
    }
}
