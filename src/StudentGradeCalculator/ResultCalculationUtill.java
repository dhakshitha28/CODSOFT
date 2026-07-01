package StudentGradeCalculator;

import java.util.Scanner;

public class ResultCalculationUtill {
    public static int isTheMarkValid(int mark, Scanner sc) {
        while(true) {
            if (mark < 0 || mark > 100) {
                System.out.print("Invalid mark. Please enter a mark between 0 and 100: ");
                mark = Integer.parseInt(sc.nextLine());
            } else {
                break;
            }
        }
        return mark;
    }
}
