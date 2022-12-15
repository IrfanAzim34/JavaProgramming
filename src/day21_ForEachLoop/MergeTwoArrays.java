package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    /*
    write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
     */

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3 = new int[arr2.length + arr1.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[index] = arr2[i];
            index++;
        }

        System.out.println(Arrays.toString(arr3));

    }

}
