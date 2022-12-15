package day08_IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;

        boolean positiveResult = number > 0;
        boolean negativeResult = number < 0;
        boolean zeroResult = 200 == 0;

        System.out.println(number + " is positive number: " + positiveResult);
        System.out.println(number + " is negative number: " + negativeResult);
        System.out.println(number + " is zero: " + zeroResult);

    }

}

/*
1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive,
   or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */