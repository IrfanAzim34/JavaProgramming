package day11_Switch_Scanner;

public class Calculator {

    /*
    Given two double variables n1, n2 and a char variable named operator.

    use swtich statement to calculate the result of nq & n2 based on the given operator

            Valid operators are: -, +, *, /
     */

    public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;

        char operator = '&';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if (valid){
            switch (operator){
                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);
            }
        }else {
            System.err.println("Invalid Operator: " + operator);
        }

    }

}
