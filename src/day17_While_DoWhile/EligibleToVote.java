package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();

        while (!(1 <= age && age <= 120)){
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Enter your age");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes,no");
        String answer = scan.next();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Wrong answer, please re-enter");
            System.err.println("Enter your answer");
            answer = scan.next();
        }

        if (age > 18 && answer.equals("yes")){
            System.out.println("You can vote!");
        }else {
            System.err.println("Sorry, your age not enough to vote");
        }

    }

}
