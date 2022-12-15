package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task3 {

    /*
    Write a program that asks user to enter two positive numbers,
    then multiply those two numbers without using multiplication (*) operator.

    if user enters any negative numbers, print Invalid

                                Ex:
                                    inputs:
                                            10
                                            20
                                    output:
                                            200
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        String  result = "";

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter a positive number");
            num1 = scan.nextInt();

            System.out.println("Enter a another positive number");
            num2 = scan.nextInt();

            if (num1 > 0 && num2 > 0){
                result =  num1 * num2 + "";
            }else {
                result = "Invalid Number";
            }
        }

        System.out.println(result);

        scan.close();

    }
}
