package day13_String;

import java.util.Scanner;

public class CheckWords {

    /*
    Write a program  for CheckWords, the program accepts 3 words and :
                                    - if they are same length:  print "All words are same length"
                                    - if some same length and others not:    print "Not Same nor Different lengths"
                                    - if all different length :  print "All different length"
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = scan.next();

        System.out.println("Enter second word:");
        String word2 = scan.next();

        System.out.println("Enter third word:");
        String word3 = scan.next();

        int word1Length = word1.length();
        int word2Length = word2.length();
        int word3Length = word3.length();

        boolean sameLength = word1Length == word2Length && word1Length == word3Length;
        boolean differentLength = word1Length != word2Length && word1Length != word3Length;

        if(sameLength){
            System.out.println("All word are same length");
        } else if (differentLength) {
            System.out.println("All different length");
        }else {
            System.out.println("Not same not different lengths");
        }

        scan.close();
    }
}
