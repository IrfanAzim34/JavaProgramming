package day17_While_DoWhile;

import java.util.Scanner;

public class Task2 {

    /*
     Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

     hint: you need an infinite loop
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter a positive number");
            int num1 = scan.nextInt();

            System.out.println("Enter a positive number");
            int num2 = scan.nextInt();

            if (num1 < 0 || num2 < 0){
                break;
            }

            System.out.println("Sum Of Numbers: " + (num1 + num2));
        }

        scan.close();

    }

}
