package day24_CustomMethods_Return;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] reverse = reverseIntArray(arr);

        System.out.println(Arrays.toString(reverse));

    }

    public static int[] reverseIntArray(int[] arr){

        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;

    }

}
