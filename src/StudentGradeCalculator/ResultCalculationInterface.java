package StudentGradeCalculator;

public interface ResultCalculationInterface {

    public int totalMark(StudentMarkDetails studentMarkDetails);
    public  double averagePercentage(StudentMarkDetails studentMarkDetails);
    public char calculateGrade(StudentMarkDetails studentMarkDetails);
    public void displayTheResult(StudentMarkDetails studentMarkDetails);
}
