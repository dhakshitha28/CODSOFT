package StudentManagementSystem;

import java.util.List;
import java.util.Scanner;

public interface StudentManagementInterface {
    public void addStudent(List<Student> studentList, Scanner scanner);
    public void updateStudent(List<Student> studentList, Scanner scanner);
    public void deleteStudent(List<Student> studentList, Scanner scanner);
    public void findAllStudents(List<Student> studentList);
}
