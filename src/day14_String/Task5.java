package day14_String;

import java.util.Scanner;

public class Task5 {

    /*
    Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"

        HINT: 1. you need charAt() method
              2. Ascii Table

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        char firstChar = word.charAt(0);
        boolean validRange = (32 <= firstChar && firstChar <= 47) || (58 <= firstChar && firstChar <=64)
                            || (91 <= firstChar && firstChar <= 96) || (123 <= firstChar && firstChar <= 126)
                            || (48 <= firstChar && firstChar <= 57) || (65 <= firstChar && firstChar <= 90)
                            || (97 <= firstChar && firstChar <= 122);

        if (validRange){
            if (48 <= firstChar && firstChar <= 57){
                System.out.println("first character is digit");
            } else if (65 <= firstChar && firstChar <= 90) {
                System.out.println("first character is uppercase letter");
            } else if (97 <= firstChar && firstChar <= 122) {
                System.out.println("first character is lowercase letter");
            }else {
                System.out.println("first character is special character");
            }
        }

        scan.close();




    }
}
