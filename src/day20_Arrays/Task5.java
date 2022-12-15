package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    /*
    Write a program that can reverse an array of integers and returns it as new array

                    ex:
                        array = {1,2,3,4,5};
                    output:
                        reversedArray = {5,4,3,2,1};
     */

    public static void main(String[] args) {

        int[] numbers = new int[5];
        int[] reversNumbers = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }

        for (int i = numbers.length-1, j = 0; i >= 0; i--, j++) {
            reversNumbers[j] = numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reversNumbers));

        scan.close();
    }



}
