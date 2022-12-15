package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        for (int i = arr2D.length-1; i >= 0 ; i--) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();
        }


        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length-1; j >= 0 ; j--) {
                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        int[][][] arr3D = {{{1,2,3}, {4,5,6}, {7,8,9}},{{10,20,30}, {40,50,60}, {70,80,90}}};

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[1][1][2]);

        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int element : each1D) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }

        }

    }

}
