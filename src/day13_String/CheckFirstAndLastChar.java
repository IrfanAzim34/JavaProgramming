package day13_String;

import java.util.Scanner;

public class CheckFirstAndLastChar {

    /*
    write a program that can check if the first and last characters of the string are same
                                            ex:
                                                level
                                            output:
                                                same
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = scan.nextLine();
        int strLastChar = str.length() - 1 ;

        if (str.charAt(0) == str.charAt(strLastChar)){
            System.out.println("same");
        }else {
            System.out.println("different");
        }

        scan.close();

    }
}
