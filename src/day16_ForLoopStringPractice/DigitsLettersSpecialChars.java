package day16_ForLoopStringPractice;

import java.util.Scanner;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scan.nextLine();

        String digits = "", letters = "", specialChar = "";

        for (int i = 0; i < str.length(); i++) {
            if (('a' <= str.charAt(i) && str.charAt(i) <='z') || ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')){
                letters += str.charAt(i) + " ";
            } else if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                digits += str.charAt(i) + " ";
            }else {
                specialChar += str.charAt(i) + " ";
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);

        scan.close();

    }

}
