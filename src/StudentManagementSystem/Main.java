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

                System.out.println("\n Update Student Information");
                System.out.println("\n If you want to exist from the Student update task typ EXIT");
                while (true) {
                    System.out.println("\nEnter the Roll No of the Student you want to update:");
                    String rollNo = scanner.nextLine();

                    for (Student s : studentList) {
                        if (s.getRollNo().equals(rollNo)) {
                            // Update student information
                            while (true) {
                                System.out.println("Which details you want to update?");
                                System.out.println("1. Student Name");
                                System.out.println("2. Student Class Code");
                                System.out.println("3. Student Grade");
                                System.out.println("4. Student Age");
                                System.out.println("5. Student Address");
                                System.out.print("Enter your choice:");
                                int updateChoice = Integer.parseInt(scanner.nextLine());
                                if (updateChoice == 1) {
                                    System.out.print("Enter new Student Name:");
                                    String newStudentName = scanner.nextLine();
                                    s.setStudentName(newStudentName);
                                    break;
                                } else if (updateChoice == 2) {
                                    System.out.print("Enter new Student Class Code:");
                                    String newStudentClassCode = scanner.nextLine();
                                    s.setClassCode(newStudentClassCode);
                                    break;
                                } else if (updateChoice == 3) {
                                    System.out.print("Enter new Student Grade:");
                                    String newStudentGrade = scanner.nextLine();
                                    s.setGrade(newStudentGrade);
                                    break;
                                } else if (updateChoice == 4) {
                                    System.out.print("Enter new Student Age:");
                                    String newStudentAge = scanner.nextLine();
                                    s.setAge(newStudentAge);
                                    break;
                                } else if (updateChoice == 5) {
                                    System.out.print("Enter new Student Address:");
                                    String newStudentAddress = scanner.nextLine();
                                    s.setAddress(newStudentAddress);
                                    break;
                                } else {
                                    System.out.println("Invalid choice!");
                                }
                            }
                        }
                        else{
                            System.out.println("Student name is not available!");
                        }
                    }
                }


            }
        }
    }
}
