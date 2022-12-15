package day17_While_DoWhile;

import java.util.Scanner;

public class Task3 {

    /*
    write a program to ask user to enter two number and math operator, and return the result.

    if the operator is invalid operator, ask user to re-enter the operator until user
    provides a valid operator (+, -, *, /)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        double num1 = scan.nextInt();

        System.out.println("Enter a number");
        double num2 = scan.nextInt();

        System.out.println("Please enter a operator(+, -, *, /)");
        String operator = scan.next();

        while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))){
            System.err.println("Invalid Operator, please re-enter");
            System.out.println("Enter a operator");
            operator = scan.next();
        }

        double result = 0;

        switch (operator){
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                result = num1 / num2;
        }

        System.out.println("result = " + result);

        scan.close();

    }

}
