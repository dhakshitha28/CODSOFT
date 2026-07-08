package StudentManagementSystem;

public class Student {
    private String studentName;
    private String rollNo;
    private String classCode;
    private String grade;
    private String age;
    private String address;

    Student(String studentName,String rollNo,String classCode,String grade,String age,String address){
        this.studentName=studentName;
        this.rollNo=rollNo;
        this.classCode=classCode;
        this.grade=grade;
        this.age=age;
        this.address=address;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String  grade) {
        this.grade = grade;
    }

    public String  getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
