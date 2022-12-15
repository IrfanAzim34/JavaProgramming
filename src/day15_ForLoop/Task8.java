package day15_ForLoop;

import java.util.Scanner;

public class Task8 {

    /*
    Write a program that can check if the given String is palindrome

                                            Ex:
                                                input:
                                                    Level
                                                output:
                                                    true
                                                input:
                                                    Anna
                                                output:
                                                    true
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = scan.nextLine();

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }


        if (str.equalsIgnoreCase(result)){
            System.out.println("true");
        }else {
            System.err.println("false");
        }

        scan.close();

    }
}
