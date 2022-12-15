package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    /*
    Write a program that can count the even and odd number from an array of integers

    Note: MUST use for each loop
     */

    public static void main(String[] args) {

        int[] numbers = new int[10];

        Scanner scan= new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenCount += numbers[i];
            }else {
                oddCount += numbers[i];
            }
        }

        System.out.println("Odd Count = " + oddCount);
        System.out.println("Even Count = " + evenCount);

        scan.close();
    }

}
