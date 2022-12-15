package day14_String;

import java.util.Scanner;

public class Task1 {

    /*
    Ask user to enter two words. Print first word without its first character then print the second word without its
    first character.
                        Input:
                            apple
                            banana
                        Output:
                            ppleanana
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord = scan.next().substring(1);

        System.out.println("Enter second word");
        String secondWord = scan.next().substring(1);

        System.out.println(firstWord + secondWord);

        scan.close();


    }

}
