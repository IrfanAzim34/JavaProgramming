package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Task1 {

    /*
    Write a program that can reverse a two-dimensional array (return new array)
                        Ex:
                            array = { {1,2,3}, {4,5,6}};
                        output:
                            reverse = { {6,5,4}, {3,2,1},};
     */

    public static void main(String[] args) {

        int[][] array = {{1,2,3}, {4,5,6}, {5,7,8}};

        int[][] reverse = new int[array.length][];

        for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {
            int[] temp = new int[array[i].length];
            for (int j = array[i].length - 1, g = 0; j >= 0; j--, g++) {
                temp[g] = array[i][j];
            }

            reverse[k] = temp;

        }

        System.out.println(Arrays.deepToString(reverse));

    }

}
