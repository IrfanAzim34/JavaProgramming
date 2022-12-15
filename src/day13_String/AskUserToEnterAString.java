package day13_String;

import java.util.Scanner;

public class AskUserToEnterAString {

    /*
    Write a method that asks user to enter a string.

            if the string is empty, print: string is empty
            if the string has more than 3 characters, print the last three characters
            if the string has less than or equal 3 characters, print the string itself
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = scan.nextLine();

        int strLength = str.length();

        if (strLength == 0){
            System.out.println("string is empty");
        } else if (strLength > 0 && strLength <= 3) {
            System.out.println(str);
        }else {
            System.out.println(str.charAt(strLength-1) + "," + str.charAt(strLength - 2) + "," + str.charAt(strLength-3));
        }

        scan.close();

    }
}
