package day15_ForLoop;

import java.util.Scanner;

public class Task3 {

    /*
    write a program that can calculate the sum of all numbers between 1 to any given number
                                            ex:
                                                input: 100
                                                output: 5050

                                                input: 50
                                                output: 1275
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter the end number:");
        int endNumber = scan.nextInt();

        for (int i = 1; i < endNumber+1; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        scan.close();

    }
}
