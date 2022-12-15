package day18_NestedLoop;

import java.util.Scanner;

public class Task4 {

    /*
    Write a program that can find the frequency of the characters from a string

                                     Ex:
                                        str = "aabcccd";
                                    output:
                                        a2b1c3d1

    Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            if (!(result.contains(str.charAt(i) + ""))){
                result += str.charAt(i) + "" + count;
            }
        }
        System.out.println(result);

        scan.close();

    }

}
