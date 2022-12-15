package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task2 {

    /*
    Write a program that asks user to enter a string and a char,
    the returns the frequency of the char from the given string

                                    Ex:
                                        inputs:
                                                str = "aabcccd";
                                                char = 'c';
                                        output: 3

                                        inputs:
                                                "Java programming language"
                                                'g'
                                        output: 4
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = "";
        char ch;
        int result = 0;

        for (int i = 1; i < 2 ; i++) {
            System.out.println("Enter a string");
            str = scan.nextLine();

            System.out.println("Enter a char");
            ch = scan.next().charAt(0);

            if(str.contains(""+ch)){
                result += str.indexOf(ch);
                System.out.println("result = " + result);
            }
        }

        scan.close();

    }
}
