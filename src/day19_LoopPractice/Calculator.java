package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        System.out.println("Enter a operator");
        char operator = scan.next().charAt(0);
        if (!(operator == '+' || operator == '-')) {
            System.err.println("Invalid Operator: " + operator);
            System.exit(0);
        }
        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            default:
                System.out.println(num1 - num2);
        }

        scan.close();

    }

}
