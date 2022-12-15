package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task5 {

    /*
    write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

                            Ex:
                                sentence = "caT dog dogG cAt"
                                output:
                                        true
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dogTimes = 0;
        int catTimes = 0;

        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        for (int i = 0; i < sentence.length()-2; i++){
            if (sentence.toLowerCase().substring(i,i+3).equals("cat")){
                catTimes += 1;
            }
            if (sentence.toLowerCase().substring(i,i+3).equals("dog")){
                dogTimes += 1;
            }
        }

        boolean result = catTimes == dogTimes;
        System.out.println(result);

        scan.close();

    }
}
