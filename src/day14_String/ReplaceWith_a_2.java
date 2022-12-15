package day14_String;

import java.util.Scanner;

public class ReplaceWith_a_2 {

    /*
    Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        if (word.charAt(0) == 'x'){
            System.out.println(word.replaceFirst("x","a"));
        }
        if (word.charAt(0) == 'X'){
            System.out.println(word.replaceFirst("X","a"));
        }

        scan.close();

    }
}
