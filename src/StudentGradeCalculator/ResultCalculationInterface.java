package StudentGradeCalculator;

public interface ResultCalculationInterface {

    public int totalMark(int tamMark,int engMark,int mathMark,int sciMark,int socialMark);
    public  int averagePercentage(int tamMark,int engMark,int mathMark,int sciMark,int socialMark);
    public char calculateGrade(int tamMark, int engMark, int mathMark, int sciMark, int socialMa);
    public void displayTheResult(String studentName,int tamMark, int engMark, int mathMark, int sciMark, int socialMa);
}
