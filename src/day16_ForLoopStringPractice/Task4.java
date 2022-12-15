package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task4 {

    /*
    write a program that can return the frequency of the  word Java from the sentence

                Ex:
                    sentence = "Java Java";

                    output:
                           2

                Hint: you need to create
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String Java = "Java";
        int frequency = 0;

        System.out.println("Enter a Sentence");
        String sentence = scan.nextLine();

        for (int i = 0; i < sentence.length()-3; i++) {

            if (sentence.substring(i, i+4).equals(Java)) {
                frequency += 1;
            }
         }

        System.out.println("Frequency = " + frequency);

        scan.close();

    }
}
