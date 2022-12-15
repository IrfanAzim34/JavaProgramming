package day11_Switch_Scanner;

public class NumberToWords {

    /*
    Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
     */

    public static void main(String[] args) {

        int number = 19;
         String result = (0 <= number && number <= 9)? (number == 0)?"Zero" :(number == 1)?"One"
                 :(number == 2)?"Two" :(number == 3)?"Three" :(number == 4)?"Four" :(number == 5)?"FIve"
                 :(number == 6)?"Five" :(number == 7)?"Seven" :(number == 8)?"Eight" :"Nine" :"Invalid Number";

        System.out.println(result);

    }
}
