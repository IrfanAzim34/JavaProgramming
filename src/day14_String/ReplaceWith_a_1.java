package day14_String;

import java.util.Scanner;

public class ReplaceWith_a_1 {

    /*
    Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        if (word.charAt(0) == 'x'){
            System.out.println(word.replaceFirst("x","a"));
        }

        scan.close();

    }
}
