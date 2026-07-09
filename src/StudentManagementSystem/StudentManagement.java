package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement implements StudentManagementInterface {



    public void addStudent(List<Student> studentList, Scanner scanner) {

        System.out.println("\nIf you want to exit from the Student Add Task type EXIT");

        while (true) {

            this.findAllStudents(studentList);

            try {

                System.out.print("Enter Student Name: ");
                String studentName = scanner.nextLine();

                if (studentName.equalsIgnoreCase("EXIT")) {
                    throw new Exception();
                }

                System.out.print("Enter Student Roll No: ");
                String rollNo = scanner.nextLine();

                if (rollNo.equalsIgnoreCase("EXIT")) {
                    throw new Exception();
                }

                boolean exists = false;

                for (Student s : studentList) {

                    if (s.getRollNo().equals(rollNo)) {

                        exists = true;

                        System.out.println("\nStudent Roll No already exists!");
                        System.out.println("Student Name      : " + s.getStudentName());
                        System.out.println("Student Roll No   : " + s.getRollNo());
                        System.out.println("Student Class Code: " + s.getClassCode());
                        System.out.println("Student Grade     : " + s.getGrade());
                        System.out.println("Student Age       : " + s.getAge());
                        System.out.println("Student Address   : " + s.getAddress());

                        break;
                    }
                }

                if (!exists) {

                    System.out.print("Enter Student Class Code: ");
                    String studentClassCode = scanner.nextLine();

                    if (studentClassCode.equalsIgnoreCase("EXIT")) {
                        throw new Exception();
                    }

                    System.out.print("Enter Student Grade: ");
                    String studentGrade = scanner.nextLine();

                    if (studentGrade.equalsIgnoreCase("EXIT")) {
                        throw new Exception();
                    }

                    System.out.print("Enter Student Age: ");
                    String studentAge = scanner.nextLine();

                    if (studentAge.equalsIgnoreCase("EXIT")) {
                        throw new Exception();
                    }

                    System.out.print("Enter Student Address: ");
                    String studentAddress = scanner.nextLine();

                    if (studentAddress.equalsIgnoreCase("EXIT")) {
                        throw new Exception();
                    }

                    Student student = new Student(
                            studentName,
                            rollNo,
                            studentClassCode,
                            studentGrade,
                            studentAge,
                            studentAddress);

                    studentList.add(student);

                    System.out.println("\nStudent Added Successfully!");
                }

                while (true) {

                    System.out.print("Do you want to add another student? (YES/NO): ");
                    String choiceAdd = scanner.nextLine();

                    if (choiceAdd.equalsIgnoreCase("YES")) {
                        break;
                    } else if (choiceAdd.equalsIgnoreCase("NO")
                            || choiceAdd.equalsIgnoreCase("EXIT")) {
                        throw new Exception();
                    } else {
                        System.out.println("Invalid Choice! Please enter YES or NO.");
                    }
                }

            } catch (Exception e) {
                System.out.println("\nSuccessfully Exited from the Student Add Task");
                break;
            }
        }
    }

    public void updateStudent(List<Student> studentList, Scanner scanner) {

        while (true) {

            this.findAllStudents(studentList);

            System.out.print("Enter Roll No (Type EXIT to quit): ");
            String rollNo = scanner.nextLine();

            if (rollNo.equalsIgnoreCase("EXIT")) {
                System.out.println("Successfully Exited from Student Update Task");
                break;
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

                System.out.println("\n===== Update Student =====");
                System.out.println("1. Student Name");
                System.out.println("2. Student Class Code");
                System.out.println("3. Student Grade");
                System.out.println("4. Student Age");
                System.out.println("5. Student Address");
                System.out.println("6. Completed");
                System.out.print("Enter your choice: ");

                int updateChoice = Integer.parseInt(scanner.nextLine());

                switch (updateChoice) {

                    case 1:
                        System.out.print("Enter New Student Name: ");
                        student.setStudentName(scanner.nextLine());
                        System.out.println("Student Name Updated Successfully.");
                        break;

                    case 2:
                        System.out.print("Enter New Student Class Code: ");
                        student.setClassCode(scanner.nextLine());
                        System.out.println("Student Class Code Updated Successfully.");
                        break;

                    case 3:
                        System.out.print("Enter New Student Grade: ");
                        student.setGrade(scanner.nextLine());
                        System.out.println("Student Grade Updated Successfully.");
                        break;

                    case 4:
                        System.out.print("Enter New Student Age: ");
                        student.setAge(scanner.nextLine());
                        System.out.println("Student Age Updated Successfully.");
                        break;

                    case 5:
                        System.out.print("Enter New Student Address: ");
                        student.setAddress(scanner.nextLine());
                        System.out.println("Student Address Updated Successfully.");
                        break;

                    case 6:
                        System.out.println("Student Updated Successfully.");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                        continue;
                }

                if (updateChoice == 6) {
                    break;
                }
            }
        }
    }

    public void deleteStudent(List<Student> studentList, Scanner scanner) {

        while (true) {

            this.findAllStudents(studentList);

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
                        System.out.println("Student Deleted Successfully.");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found.");
                }

            } catch (Exception e) {

                System.out.println("Successfully Exited from Student Delete Task");
                break;
            }
        }
    }

    public void findAllStudents(List<Student> studentList) {

        if (studentList.isEmpty()) {
            System.out.println("No Student Details are Available.");
            return;
        }

        System.out.println("\n========== Student Details ==========");

        for (Student s : studentList) {

            System.out.println("-------------------------------------");
            System.out.println("Student Name      : " + s.getStudentName());
            System.out.println("Student ClassCode : " + s.getClassCode());
            System.out.println("Student Roll No   : " + s.getRollNo());
            System.out.println("Student Grade     : " + s.getGrade());
            System.out.println("Student Age       : " + s.getAge());
            System.out.println("Student Address   : " + s.getAddress());
        }
    }
}
