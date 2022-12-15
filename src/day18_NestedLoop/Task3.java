package day18_NestedLoop;

import java.util.Scanner;

public class Task3 {

    /*
    Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-,/,*) (if user enters any invalid operator, repeat this step until
    user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue? (yes/no)

if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo calculator!"
If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Please enter a number");
            int num1 = scan.nextInt();

            System.out.println("Please enter a math operator (+,-,/,*)");
            String operator = scan.next();

            while (!(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*"))){
                System.err.println("Invalid opeator, please re-enter");
                operator = scan.next();
            }

            System.out.println("Please enter second number");
            int num2 = scan.nextInt();

            int result = 0;

            if (operator.equals("+")){
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            }else {
                result = num1 / num2;
            }

            System.out.println("Result is: " + result);

            System.out.println("Would you like to continue? (yes / no)");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer, please re-enter your answer (yes / no)");
                answer = scan.next();
            }

            if (answer.equals("no")){
                break;
            }

        }

        scan.close();

    }

}
