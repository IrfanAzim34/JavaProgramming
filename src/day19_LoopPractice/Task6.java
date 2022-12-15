package day19_LoopPractice;

import java.util.Scanner;

public class Task6 {

    /*
    Write a program that can find the character that has the highest frequency from a string
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scan.next();
        int frequency = 0;
        String chars = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            String temporary = str.charAt(i)+"";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count > frequency){
                chars = temporary;
                frequency = count;
            }

            if (count == frequency && !chars.contains(temporary)){
                chars += temporary;
            }

        }

        System.out.println("High Frequency Chars = " + chars);

        scan.close();

    }

}
