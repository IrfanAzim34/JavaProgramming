package day24_CustomMethods_Return;

import java.util.Arrays;

public class Task10 {

    /*
    create a method named removeElement that passes one integer array and one integer, the method removes
    the integer index from the integer array and returns the new array

                    Ex:
                        array = {10, 20, 30, 40, 50, 60}
                        index = 2
                        removeElement(array, index) ==== {10, 20, 40, 50, 60}
     */

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;

        removeElement(array,index);

    }

    public static void removeElement(int[] arr, int index){

        int[] arr1 = new int[arr.length-1];
        int indexOfArr1 = 0;

        if (index > arr.length-1){
            System.out.println("Invalid Index");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == index){
                continue;
            }

            arr1[indexOfArr1] = arr[i];
            indexOfArr1++;
        }

        System.out.println(Arrays.toString(arr1));

    }

}
