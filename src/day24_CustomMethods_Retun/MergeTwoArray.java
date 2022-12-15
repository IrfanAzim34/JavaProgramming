package day24_CustomMethods_Retun;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,67,4};
        int[] arr2 = {4,5};

        int[] arr3 = mergerTwoArray(arr1,arr2);

        System.out.println(Arrays.toString(arr3));

    }


    public static int[] mergerTwoArray(int[] arr1, int[] arr2){

        int[] temp = new int[arr1.length+arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            temp[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            temp[index] = arr2[i];
            index++;
        }

        return temp;

    }

}
