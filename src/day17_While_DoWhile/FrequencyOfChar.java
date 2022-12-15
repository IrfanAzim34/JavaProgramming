package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfChar {

    /*
    Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enetr a string");
        String str = scan.nextLine();

        System.out.println("Enter a char");
        char ch = scan.next().charAt(0);
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                frequency += 1;
            }else {
                frequency += 0;
            }
        }

        System.out.println(frequency);

    }

}
