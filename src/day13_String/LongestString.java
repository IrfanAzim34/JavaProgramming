package day13_String;

import java.util.Scanner;

public class LongestString {

    /*
    write a program that asks user to enter two strings, and print out the longest string
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = scan.nextLine();

        System.out.println("Enter second string:");
        String str2 = scan.nextLine();

        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length != str2Length){
            if (str1Length > str2Length){
                System.out.println("The longest string is:\n" + str1);
            }else {
                System.out.println("The longest string is:\n" + str2);
            }
        }

        scan.close();

    }

}
