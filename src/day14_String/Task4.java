package day14_String;

import java.util.Scanner;

public class Task4 {

    /*
    Ask user to enter two words. Then add them together and print.But if the last letter if the first word and the
    first letter of the last letter is the same,print that character once.
                                                                                    Input:
                                                                                        one
                                                                                        eight
                                                                                    Output:
                                                                                        oneight
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scan.next();

        System.out.println("Enter second word:");
        String secondWord = scan.next();

        int firstLength = firstWord.length();

        if (firstWord.substring(firstLength-1).equals(secondWord.substring(0,1))){
            System.out.println(firstWord.substring(0,firstLength-1) + secondWord);
        }else {
            System.out.println(firstWord + secondWord);
        }

        scan.close();

    }
}
