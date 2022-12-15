package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("How old are you?");
            int age = scan.nextInt();

            while (age <= 0 || age >= 120){
                System.err.println("Invalid Entry, please re-enter your age");
                System.out.println("How old are you?");
                age = scan.nextInt();
            }

            if (age >= 18){
                System.out.println("You can buy alcohol");
            }

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))){
                System.err.println("Invalid entry, please re-enter you answer");
                System.out.println("Would you like to continue?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }

        }

        scan.close();

    }

}
