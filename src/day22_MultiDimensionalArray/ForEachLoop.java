package day22_MultiDimensionalArray;

public class ForEachLoop {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        for (int[] array : arr2D) {
            for (int i : array) {
                System.out.println(i);
            }
        }

    }

}
