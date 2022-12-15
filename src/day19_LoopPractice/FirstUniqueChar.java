package day19_LoopPractice;

import java.util.Scanner;

public class FirstUniqueChar {

    //Write a program that can return the index number of the first unique character.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count == 1){
                System.out.println("First Unique Character is: " + str.charAt(i));
                break;
            }
        }

        scan.close();

    }

}
