package day15_ForLoop;

import java.util.Scanner;

public class Task5 {
    
    /*
    write a program that can retive the digits, letters and special characters from a string
                                
                                Ex:
                                    input:
                                        mn@#123Ab!
                                    output:
                                        letters: mnAb
                                        digits: 123
                                        special chars: @#!
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word or String:");
        String word = scan.nextLine();
        String letters = "", digits = "", specialChars = "";

        for (int i = 0; i < word.length(); i++) {
            if (('a' <= word.charAt(i) && word.charAt(i) <= 'z') || ('A' <= word.charAt(i) && word.charAt(i) <= 'Z')){
                letters += word.charAt(i);
            } else if ('0' <= word.charAt(i) && word.charAt(i) <= '9') {
                digits += word.charAt(i);
            }else {
                specialChars += word.charAt(i);
            }
        }

        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + specialChars);

        scan.close();
        
    }
}
