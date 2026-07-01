package StudentGradeCalculator;

public class StudentMarkDetails {

    private String studentName;
    private int tamilMarks;
    private int englishMark;
    private int mathMarks;
    private int scienceMarks;
    private int socialMarks;

    public StudentMarkDetails(String studentName, int tamilMarks, int englishMarks, int mathMarks, int scienceMarks, int socialMarks) {
        this.studentName = studentName;
        this.tamilMarks = tamilMarks;
        this.englishMark = englishMarks;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.socialMarks = socialMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTamilMarks() {
        return tamilMarks;
    }

    public void setTamilMarks(int tamilMarks) {
        this.tamilMarks = tamilMarks;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(int englishMark) {
        this.englishMark = englishMark;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getSocialMarks() {
        return socialMarks;
    }

    public void setSocialMarks(int socialMarks) {
        this.socialMarks = socialMarks;
    }
}
