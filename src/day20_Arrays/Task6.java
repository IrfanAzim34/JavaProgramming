package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    /*
    write a program that can move all the zeros to the end of the array

                        Ex:
                            array = {10, 0, 5, 0, 1, 0};
                        output:
                                    {10, 5, 1, 0, 0, 0}
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[6];
        int[] numbers2 = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0){
                numbers2[index] = numbers[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        scan.close();

    }

}
