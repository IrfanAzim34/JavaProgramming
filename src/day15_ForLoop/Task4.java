package day15_ForLoop;

import java.util.Scanner;

public class Task4 {

    /*
    Write a program that can return the factorial number of any given number

                                    Ex:
                                        input: 5
                                        output: 120

                                            ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 1;

        System.out.println("Enter a number:");
        int num = scan.nextInt();

        for (int i = num; i > 0; i--){
            sum = sum * i;
        }

        System.out.println(sum);

        scan.close();

    }
}
