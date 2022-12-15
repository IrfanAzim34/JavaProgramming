package day17_While_DoWhile;

import java.util.Scanner;

public class Task1 {

    /*
     Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double resultOfDivision = 0;
        double resultOfMultiplication = 0;

        System.out.println("Enter a positive number");
        double num1 = scan.nextDouble();

        System.out.println("Enter a positive number");
        double num2 = scan.nextDouble();

        while (!(num1 > 0 && num2 > 0)){
            System.err.println("You must be enter two positive numbers");
            System.out.println("Enter a positive number");
            num1 = scan.nextDouble();

            System.out.println("Enter a positive number");
            num2 = scan.nextDouble();
        }

        if (num1 > 0 && num2 > 0){
            resultOfDivision = num1 / num2;
            resultOfMultiplication = num1 * num2;
        }

        System.out.println("resultOfDivision = " + resultOfDivision);
        System.out.println("resultOfMultiplication = " + resultOfMultiplication);

        scan.close();

    }

}
