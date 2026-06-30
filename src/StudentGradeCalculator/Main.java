package StudentGradeCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to StudentGradeCalculator");
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your Tamil Marks:");
        int tamMark=Integer.parseInt(sc.nextLine());
        System.out.print("Enter your English Marks:");
        int engMark=Integer.parseInt(sc.nextLine());
        System.out.println("Enter your Mathematics Marks:");
        int mathMark=Integer.parseInt(sc.nextLine());
        System.out.println("Enter your science Marks:");
        int scMark=Integer.parseInt(sc.nextLine());
        System.out.print("Enter your Social Marks:");
        int socMark=Integer.parseInt(sc.nextLine());

        Marks marks=new Marks(name,tamMark,engMark,mathMark,scMark,socMark);

        System.out.println("What are the activity you can do with me");
        System.out.println("1.Want to calculate the Total Marks");
        System.out.println("2.Want to calculate the average Marks");
        System.out.println("3.want to calculate the Grade Marks");
        System.out.println("4.Display the complete result");
        System.out.println("Enter your choice:");



    }
}
