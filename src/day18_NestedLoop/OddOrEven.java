package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    /*
    Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enters invalid answer, repeat the previous steps
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0){
                System.out.println("<<" + num + " is a Even number >>");
            }else {
                System.out.println("<<" + num + " is a Odd number >>");
            }

            System.out.println("Would you like to enter another number?");
            String str = scan.next().toLowerCase();

            while (!(str.equals("yes") || str.equals("no"))){
                System.err.println("Invalid answer, please re-enter");
                System.out.println("Would you like to enter another number?");
                str = scan.next().toLowerCase();
            }

            if (str.equals("no")){
                break;
            }

        }

        scan.close();

    }

}
