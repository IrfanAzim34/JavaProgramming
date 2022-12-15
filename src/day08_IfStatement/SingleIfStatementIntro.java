package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 306;

        boolean evenNumber = number % 2 == 0;

        if (evenNumber) {
            System.out.println(number + " is a Even Number.");
        }

        if (!evenNumber) {
            System.out.println(number + " is a Odd Number.");
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        int n =-200;

        if (n > 0){
            System.out.println(n + " is positive.");
        }

        if (n < 0){
            System.out.println(n + " is negative.");
        }

        if (n ==0){
            System.out.println(n + " is zero.");
        }

    }

}
