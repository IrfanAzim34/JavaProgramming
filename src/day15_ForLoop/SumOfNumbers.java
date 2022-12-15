package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    /*
    Write a program that can calculate the sum of all integers between 1 to 100
     */

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 101; i++) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println("-----------------------------------------------------------------------------------------");

        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number");
            total += scan.nextInt();
        }

        System.out.println("Total = " + total);

        scan.close();



    }
}
