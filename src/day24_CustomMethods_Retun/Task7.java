package day24_CustomMethods_Retun;

import java.util.Arrays;

public class Task7 {

    /*
    Create a method named merge that passes two integer array parameters, the method can merge two integer arrays
    and return the new array

                        Ex:
                            arr1 = {1,2,3}
                            arr2 = {4,5,6}
                            merge(arr1, arr2) ====> {1,2,3,4,5,6}
     */

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] merge = merge(arr1,arr2);

        System.out.println(Arrays.toString(merge));

    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[index] = arr2[i];
            index++;
        }

        return arr3;
    }
}
