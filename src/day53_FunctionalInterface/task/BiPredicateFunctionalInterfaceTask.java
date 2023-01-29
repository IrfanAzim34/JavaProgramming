package day53_FunctionalInterface.task;

import java.util.*;
import java.util.function.BiPredicate;

public class BiPredicateFunctionalInterfaceTask {

    public static void main(String[] args) {

        /*
        Create a function that can check if two array are equal and contains the same elemnts
                    ex: arr1 = {3,2,1}
                        arr2 = {2,1,3}
                    output: true
         */
        BiPredicate<int[],int[]> isEqual = (arr1,arr2) -> {

            int[] temp1 = arr1, temp2 = arr2;
            Arrays.sort(temp1);
            Arrays.sort(temp2);

            return Arrays.equals(temp1,temp2);

        };

        int[] arr1 = {3,2,1,1};
        int[] arr2 = {2,1,3};
        System.out.println(isEqual.test(arr1, arr2));

        System.out.println("--------------------------------------");

        /*
        Create a function that can check if the first array contains all the elemnts of the second array:
                    ex: arr1 = {1,2,3,4,5,6}
                        arr2 = {7,8}
                    output: false
         */
        BiPredicate<int[],int[]> contains = (arr3,arr4) -> {

            Set<Integer> temp = new HashSet<>();

            for (int each : arr3) {
                temp.add(each);
            }

            for (int each : arr4) {
                if (!temp.contains(each)){
                    return false;
                }
            }

            return true;

        };

        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {7,2};
        System.out.println(contains.test(array1, array2));

        System.out.println("--------------------------------------");

        /*
        Create a function that can check if two List of Integers are equal and contains the same elemnts
                    ex: list1 = {3,2,1}
                        list2 = {2,1,3}
                    output: true
         */
        BiPredicate<List<Integer>,List<Integer>> equalAndContain = (l1, l2) -> {

            List<Integer> temp1 = l1;
            List<Integer> temp2 = l2;

            Collections.sort(temp1);
            Collections.sort(temp2);

            return temp1.equals(temp2);

        };

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,76,2,6,8,32,568));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(568,4,76,2,6,8,32,1));
        System.out.println(equalAndContain.test(list1, list2));

        System.out.println("-------------------------------------------");

        /*
        Create a function that can check if the first List contains all the elemnts of the second List:
                    ex: list1 = {1,2,3,4,5,6}
                        list2 = {7,8}
                    output: false
         */
        BiPredicate<List<Integer>,List<Integer>> listContainsList = (l1,l2) -> {

            Set<Integer> temp = new HashSet<>();

            for (Integer each : l1) {
                temp.add(each);
            }

            for (Integer each : l2) {
                if (!(temp.contains(each)))
                    return false;
            }

            return true;

        };

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,6));
        System.out.println(listContainsList.test(list3, list4));

    }

}
