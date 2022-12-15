package day20_Arrays;

import java.util.Scanner;

public class Task7 {

    /*
    Write a program that can print out the common elements from two integer array

                            Ex:
                                arr1: {1,2,3,4,5}
                                arr2: {4,5,6,7,8}
                            output:
                                    4 5
     */

    public static void main(String[] args) {

        int[] numbers = new int[5];
        int[] numbers2 = new int[5];
        String commonElements = "";

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Enter a number");
            numbers2[i] = scan.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers[i] == numbers2[j]){
                    count++;
                }
            }
            if (count > 0 && !commonElements.contains("" + numbers[i])) {
                commonElements += numbers[i] + " ";
            }
        }

        System.out.println("Common Elements = " + commonElements);

        scan.close();

    }

}
