package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbcacd";

        // write a program that can check if str1 & str2 are build out same characters

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean anagram = Arrays.equals(char1,char2);

        if (anagram)
            System.out.println("Anagram: " + anagram);
        else
            System.out.println("Anagram = " + anagram);

    }

}
