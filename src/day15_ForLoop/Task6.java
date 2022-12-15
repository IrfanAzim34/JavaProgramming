package day15_ForLoop;

import java.util.Scanner;

public class Task6 {

    /*
    Write a program that can return the sum of digits from a  string
            Ex:
                input: A1B2C3
                output:    6

    Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
                ...
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('0' <= ch && ch <= '9'){
                sum += ch -48;
            }
        }

        System.out.println("sum = " + sum);

        scan.close();


    }
}
