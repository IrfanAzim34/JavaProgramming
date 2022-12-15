package day21_ForEachLoop;

import java.util.Scanner;

public class Task6 {

    /*
    Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
                (similar to task 97 in repl.it, but this time you MUST use arrays and for each loop)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scan.nextLine().toLowerCase();

        String[] arr = sentence.split(" ");

        int countJava = 0, countPython =0;

        for (String s : arr) {
            if (s.contains("java")){
                countJava++;
            }

            if (s.contains("python")){
                countPython++;
            }
        }

        System.out.println("In sentence we found \"java\" " + countJava + " times");
        System.out.println("In sentence we found \"python\" " + countPython + " times");

        scan.close();

    }

}
