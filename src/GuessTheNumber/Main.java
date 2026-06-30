package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
            Random random = new Random();
            int num = random.nextInt(100) + 1;

            int attempt=0;

            System.out.println("Enter the number between 1 and 100");
            Scanner sc = new Scanner(System.in);
            int userGuessNumber=Integer.parseInt(sc.nextLine());

            while(userGuessNumber!=num){
                attempt++;
                if(userGuessNumber>num){
                    System.out.println("Your guess Number is too high");
                    System.out.print("Guess the another number:" );
                    userGuessNumber=Integer.parseInt(sc.nextLine());
                }
                else{
                    System.out.println("Your guess Number is too low");
                    System.out.print("Guess the another number:" );
                    userGuessNumber=Integer.parseInt(sc.nextLine());
                }
            }


            if(userGuessNumber==num){
                attempt++;
                System.out.println();
                System.out.println("*********************************");
                System.out.println("You guessed the correct number");
                System.out.println("*********************************");
                int value=100 - (attempt - 1) * 10;
                System.out.println("1.Score:"+ value);
                System.out.println("2.Guess:"+ attempt);
                System.out.println("3.Correct Ans: "+ num);

            }

    }
}