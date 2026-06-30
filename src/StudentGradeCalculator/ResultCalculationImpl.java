package StudentGradeCalculator;

public class ResultCalculationImpl implements ResultCalculationInterface {

    @Override
    public int totalMark(int tamMark, int engMark, int mathMark, int sciMark, int socialMark){
        int total=tamMark+engMark+mathMark+sciMark+socialMark;
        return total;
    }

    @Override
    public int averagePercentage(int tamMark, int engMark, int mathMark, int sciMark, int socialMark) {
        int avg=(tamMark+engMark+mathMark+sciMark+socialMark) / 5;
        return avg;
    }

    @Override
    public char calculateGrade(int tamMark, int engMark, int mathMark, int sciMark, int socialMark) {
        int  avg=this.averagePercentage(tamMark, engMark, mathMark, sciMark, socialMark);
        if(avg>=90){
            return 'A';
        }
        else if(avg>=80){
            return 'B';
        }
        else if(avg>=70){
            return 'C';
        }
        else if(avg>=60){
            return 'D';
        }
        else if(avg>=55){
            return 'E';
        }
        return 'F';
    }

    @Override
    public void displayTheResult(String studentName, int tamMark, int engMark, int mathMark, int sciMark, int socialMa) {
        System.out.println("Name: "+studentName);
        System.out.println("Tamil Mark: "+tamMark);
        System.out.println("Eng Mark: "+engMark);
        System.out.println("Math Mark: "+mathMark);
        System.out.println("Sci Mark: "+sciMark);
        System.out.println("Social Mark: "+socialMa);
        System.out.println("Total Mark:"+this.totalMark(tamMark, engMark, mathMark, sciMark, socialMa));
        System.out.println("Average :"+this.averagePercentage(tamMark, engMark, mathMark, sciMark, socialMa));
        char grade=this.calculateGrade(tamMark, engMark, mathMark, sciMark, socialMa);
        System.out.println("Grade :"+grade);
        System.out.println("/n*************************************");
        String result="Pass";
        if(grade=='F'){
            result="Fail";
        }
        System.out.println("Result :"+result);
        System.out.println("/n*************************************");
    }
}
