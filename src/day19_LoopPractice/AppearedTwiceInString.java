package day19_LoopPractice;

import java.util.Scanner;

public class AppearedTwiceInString {

    //Write a program that can display all the characters that appeared twice in the string.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count == 2 && !result.contains(str.charAt(i)+"")){
                result += str.charAt(i);
            }
        }

        System.out.println(result);

        scan.close();

    }

}
