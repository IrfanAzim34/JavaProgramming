package day53_FunctionalInterface.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFunctionTest {

    public static void main(String[] args) {

        //Create a function that can return the maximum number from a list of Integer
        ListFunction<List<Integer>,Integer> returnMaxNumber = list -> Collections.max(list);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,5,2,76,9,43,6,8,3,56,7));
        System.out.println(returnMaxNumber.apply(numbers));

        //Create a function that can return the minimum number from a list of Integer
        ListFunction<List<Integer>,Integer> returnMinNumber = list -> Collections.min(list);
        System.out.println(returnMinNumber.apply(numbers));

        System.out.println("-------------------------------------------------");

        //Create a function that can return the longest String from a List of String
        ListFunction<List<String>,String> returnLongestStr = list -> {

            String longestStr = list.get(0);
            for (String each : list) {
                if (each.length() > longestStr.length())
                    longestStr = each;
            }

            return longestStr;

        };

        List<String> names = new ArrayList<>(Arrays.asList("Irfan","Java","Python","Wooden Spoon"));
        System.out.println(returnLongestStr.apply(names));

        System.out.println("--------------------------------------------------");

        //Create a function that can return the shortest String from a List of String
        ListFunction<List<String>,String> returnShortestStr = list -> {

            String shortestStr = list.get(0);
            for (String each : list) {
                if (each.length() < shortestStr.length())
                    shortestStr = each;
            }
            return shortestStr;

        };

        System.out.println(returnShortestStr.apply(names));

        System.out.println("--------------------------------------------------");

        //Create a function that can convert List of integer to int array
        ListFunction<List<Integer>,int[]> convertListToArray1 = list -> {

            int[] result = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;

        };

        int[] array = convertListToArray1.apply(numbers);
        System.out.println(Arrays.toString(array));

        System.out.println("--------------------------------------------------");

        ListFunction<List<Double>,double[]> convertListToArray2 = list -> {

            double[] result = new double[list.size()];

            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;

        };

        List<Double> doubles = new ArrayList<>(Arrays.asList(1.2,2.4,6.3,7.3,3.14));
        double[] array2 = convertListToArray2.apply(doubles);
        System.out.println(Arrays.toString(array2));

    }

}
