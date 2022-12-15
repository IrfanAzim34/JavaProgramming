package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        /*
        Write the program that asks the user to enter a number for 5 times.
         */

        int maxNum = -2147483648;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num > maxNum){
                maxNum = num;
            }
        }

        System.out.println("Maximum Number = " + maxNum);

        scan.close();

    }

}
