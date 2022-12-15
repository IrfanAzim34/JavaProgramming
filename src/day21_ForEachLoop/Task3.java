package day21_ForEachLoop;

public class Task3 {

    /*
    Write a program that can print out the common elements from two integer array

                Ex:
                    arr1: {1,2,3,4,5}
                    arr2: {4,5,6,7,8}
                output:
                    4 5

                MUST use for each loops
     */

    public static void main(String[] args) {

        int[] numbers1 = {1,2,3,4,5,5,6};
        int[] numbers2 = {4,5,6,7,8,5,4};

        String commonElements = "";

        for (int i : numbers1) {
            for (int j : numbers2) {
                if (i == j && !commonElements.contains(""+i)){
                    commonElements += i + " ";
                }
            }
        }

        System.out.println(commonElements);

    }

}
