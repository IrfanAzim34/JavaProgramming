package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReverseString {

    /*
    Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        String reverseStr = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        System.out.println(reverseStr);


        scan.close();

    }
}
