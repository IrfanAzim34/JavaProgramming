package day19_LoopPractice;

import java.util.Scanner;

public class Task4 {

    /*
    Write a program for grade calculator:
            1. Ask the user "Enter your score"
            If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"
            2. Display the grade of the student.
                 90 ~ 100 ==> A
                 80 ~ 89 ==> B
                 70 ~ 79 ==> C
                 60 ~ 69 ==> D
                 0 ~ 59 ==> F
            2. Ask the user would you like to continue
            If "yes" --> repeat the previous steps
            If "no" --> print "Thank you for using Cydeo Grade Calculator APP"
            If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter your score");
            int score = scan.nextInt();

            while (!(0 <= score && score <= 100)){
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            String grade = "";

            if (90 <= score && score <= 100){
                grade = "A";
            } else if (80 <= score && score <= 89) {
                grade = "B";
            } else if (70 <= score && score <= 79) {
                grade = "C";
            } else if (60 <= score && score <= 69) {
                grade = "D";
            }else {
                grade = "F";
            }

            System.out.println("Grade = " + grade);

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);
            }
        }

    }

}
