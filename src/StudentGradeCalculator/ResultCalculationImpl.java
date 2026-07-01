package StudentGradeCalculator;

public class ResultCalculationImpl implements ResultCalculationInterface {

    @Override
    public int totalMark(StudentMarkDetails studentMarkDetails){
        int total=studentMarkDetails.getTamilMarks()+
                studentMarkDetails.getEnglishMark()+
                studentMarkDetails.getMathMarks()+
                studentMarkDetails.getScienceMarks()+
                studentMarkDetails.getSocialMarks();
        return total;
    }

    @Override
    public double averagePercentage(StudentMarkDetails studentMarkDetails) {
        double avg=(double) this.totalMark(studentMarkDetails) / 5;
        return avg;
    }

    @Override
    public char calculateGrade(StudentMarkDetails studentMarkDetails) {
        double avg=this.averagePercentage(studentMarkDetails);
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
    public void displayTheResult(StudentMarkDetails studentMarkDetails) {
        System.out.println("Name: "+studentMarkDetails.getStudentName());
        System.out.println("Tamil Mark: "+studentMarkDetails.getTamilMarks());
        System.out.println("Eng Mark: "+studentMarkDetails.getEnglishMark());
        System.out.println("Math Mark: "+studentMarkDetails.getMathMarks());
        System.out.println("Sci Mark: "+studentMarkDetails.getScienceMarks());
        System.out.println("Social Mark: "+studentMarkDetails.getSocialMarks());
        System.out.println("Total Mark:"+this.totalMark(studentMarkDetails));
        System.out.println("Average :"+this.averagePercentage(studentMarkDetails));
        char grade=this.calculateGrade(studentMarkDetails);
        System.out.println("Grade :"+grade);
        System.out.println("\n*************************************");
        String result="Pass";
        if(grade=='F'){
            result="Fail";
        }
        System.out.println("Result :"+result);
        System.out.println("\n*************************************");
    }
}
