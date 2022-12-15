package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    /*
    Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number");
        int num1 = scan.nextInt();

        System.out.println("Enter a positive number");
        int num2 = scan.nextInt();

        int count = 0;

        while (num1 >= num2){
            num1 -= num2;
            ++count;
        }

        System.out.println(count + " with a remainder of " + num1);

        scan.close();

    }

}
