package day53_FunctionalInterface.task;

public class ArrayFunctionTest {

    public static void main(String[] args) {

        //Create a function that can return the maximum number from an array of Integers
        ArrayFunction<int[],Integer> returnMaxNum = arr1 -> {

            int max = Integer.MIN_VALUE;

            for (int each : arr1) {
                if (each > max){
                    max = each;
                }
            }

            return max;

        };

        int[] arr = {2,4,67,2,67,3,67,9,932,4,8};
        System.out.println(returnMaxNum.apply(arr));

        System.out.println("-------------------------------------------");

        //Create a function that can return the minimum number from an array of Integers
        ArrayFunction<int[],Integer> returnMinNum = arr2 -> {

            int min = Integer.MAX_VALUE;

            for (int each : arr2) {
                if (each < min){
                    min = each;
                }
            }

            return min;

        };

        System.out.println(returnMinNum.apply(arr));

        System.out.println("---------------------------------------------");

        // Create a function that can return the longest String from an array of String
        ArrayFunction<String[],String> returnLongestStr = arr3 -> {

            String longest = arr3[0];

            for (String each : arr3) {
                if (each.length() > longest.length()){
                    longest = each;
                }
            }

            return longest;

        };

        String[] strArray = {"Irfan","Kayser","Wooden Spoon","Java","Function"};
        System.out.println(returnLongestStr.apply(strArray));

        System.out.println("---------------------------------------------");

        //Create a function that can return the shortest String from an array of String
        ArrayFunction<String[],String> returnShortestStr = arr4 -> {

            String shortest = arr4[0];

            for (String each : arr4) {
                if (each.length() < shortest.length())
                    shortest = each;
            }

            return shortest;
        };

        System.out.println(returnShortestStr.apply(strArray));

    }

}
