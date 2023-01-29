package day53_FunctionalInterface.task;

import java.util.*;
import java.util.function.Function;

public class FunctionFunctionalInterfaceTask {

    public static void main(String[] args) {

        //Create a function that can return the sum of digits from a string
        Function<String,Integer> sumOfChar = s -> {

            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i);
            }

            return sum;

        };

        System.out.println(sumOfChar.apply("Irfan"));

        System.out.println("----------------------------------");

        //Create a function that can convert a Set of Integers to List of Integers
        Function<Set<Integer>, List<Integer>> setToList1 = is -> {

            List<Integer> result = new ArrayList<>(is);
            return result;

        };

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,4,6,3,2,3));
        System.out.println(set);
        List<Integer> list = setToList1.apply(set);
        System.out.println(list);

        System.out.println("---------------------------------------");

        //Create a function that can convert a Set of String to List of String
        Function<Set<String>,List<String>> setToList2 = ss -> {

            List<String> result = new ArrayList<>(ss);
            return result;

        };

        Set<String> set1 = new LinkedHashSet<>(Arrays.asList("Irfan","Alina","Java","Java","Python","Predicate"));
        System.out.println(set1);
        List<String> list1 = setToList2.apply(set1);
        System.out.println(list1);

        System.out.println("---------------------------------------");

        //Create a function that can return the reversed version of an int array
        Function<int[],int[]> reverse1 = a1 -> {

            int[] result = new int[a1.length];

            for (int i = a1.length - 1; i >= 0; i--) {
                result[(a1.length - 1) - i] = a1[i];
            }

            return result;

        };

        int[] arr = {1,2,5,6,2,6,89,43,5,8,54};
        System.out.println(Arrays.toString(arr));
        int[] reversed = reverse1.apply(arr);
        System.out.println(Arrays.toString(reversed));

        System.out.println("------------------------------------");

        //Create a function that can return the reversed version of a String array
        Function<String[],String[]> reverse2 = a2 -> {

            String[] result = new String[a2.length];

            for (int i = a2.length - 1; i >= 0; i--) {
                result[(a2.length - 1) - i] = a2[i];
            }

            return result;

        };

        String[] arr2 = {"Irfan","Java","Alina","WoodenSpoon"};
        System.out.println(Arrays.toString(arr2));
        String[] reversed2 = reverse2.apply(arr2);
        System.out.println(Arrays.toString(reversed2));

        System.out.println("-----------------------------------");

        //Create a function that can return the sorted (decending) version of an int array
        Function<int[],int[]> sort1 = ints1 -> {

            Arrays.sort(ints1);
            return ints1;

        };

        int[] numbers = {1,6,2,7,9,3,7,8,2,345,72,6,73,2};
        System.out.println(Arrays.toString(numbers));
        int[] sorted1 = sort1.apply(numbers);
        System.out.println(Arrays.toString(sorted1));

        System.out.println("------------------------------------");

        //Create a function that can return the sorted (decending) version of a String array
        Function<String[],String[]> sort2 = strings -> {

            Arrays.sort(strings);
            return strings;

        };

        String[] names = {"Irfan","Alina","WoodenSpoon","Java","Predicate","Consumer","Function"};
        System.out.println(Arrays.toString(names));
        String[] sorted2 = sort2.apply(names);
        System.out.println(Arrays.toString(sorted2));

    }

}
