package day13_String;

import java.util.Scanner;

public class FirstAndLastCharOfSentence {

    /*
    write a program that asks user to enter a sentence.then print the first & last characters of the sentence
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        int sentenceLastChar = sentence.length() - 1 ;

        System.out.println("The first and last character is:" +
                                                "\n\t"+sentence.charAt(0)+" and "+ sentence.charAt(sentenceLastChar));

        scan.close();

    }

}
