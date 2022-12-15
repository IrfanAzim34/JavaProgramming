package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    /*
    Write a program that sort the array of integer in descending order
     */

    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        int[] numbersDescending = new int[numbers.length];

        for (int i = numbers.length-1,j=0; i >= 0; i--,j++) {
            numbersDescending[j] = numbers[i];
        }

        System.out.println(Arrays.toString(numbersDescending));

        scan.close();

    }

}
