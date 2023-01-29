package day53_FunctionalInterface.task;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionInterfaceTask {

    public static void main(String[] args) {

        /*
        Create a fucntion that can returns the common characters of two strings
                    ex: str1 = "Python"
                        str2 = "Wooden Spoon"
                    output: on
         */
        BiFunction<String,String,String> commonChars = (s1,s2) -> {

            String commons = "";

            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();

            for (char each : s1.toCharArray()) {
                set1.add(each);
            }

            for (char each : s2.toCharArray()) {
                set2.add(each);
            }

            for (Character character : set1) {
                if (set2.contains(character))
                    commons += "/" + character;
            }

            return commons;

        };

        String str1 = "xyz";
        String str2 = "irfan";
        System.out.println(commonChars.apply(str1, str2));

        System.out.println("---------------------------------------------------");

        //Create a function that can return the common elements of two integer arrays
        BiFunction<int[],int[],List<Integer>> commonElements1 = (ia1, ia2) -> {

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            List<Integer> commons = new ArrayList<>();

            for (int each : ia1) {
                set1.add(each);
            }

            for (int each : ia2) {
                set2.add(each);
            }

            for (Integer each : set1) {
                if (set2.contains(each))
                    commons.add(each);
            }

            return commons;

        };

        int[] arr1 = {1,5,2,45,8,432,3,67,7,432,4};
        int[] arr2 = {3,7,32,45,67,8,543,3,23,4,55,2,1,1};

        System.out.println(commonElements1.apply(arr1, arr2));

        System.out.println("------------------------------------------");

        //Create a function that can return the common elements of two String arrays
        BiFunction<String[],String[],List<String>> commonElements2 = (sa1,sa2) -> {

            Set<String> set1 = new HashSet<>();
            Set<String> set2 = new HashSet<>();
            List<String> commons = new ArrayList<>();

            for (String each : sa1) {
                set1.add(each);
            }

            for (String each : sa2) {
                set2.add(each);
            }

            for (String each : set1) {
                if (set2.contains(each))
                    commons.add(each);
            }

            return commons;

        };

        String[] arr3 = {"Irfan","Java","Python"};
        String[] arr4 = {"Irfan","Python","WoodenSpoon","Alina"};
        System.out.println(commonElements2.apply(arr3, arr4));

        System.out.println("------------------------------------------------");

        //Create a function that can return the common elements of two Lists of Integers
        BiFunction<List<Integer>,List<Integer>,List<Integer>> commonElements3 = (il1,il2) -> {

            Set<Integer> set1 = new HashSet<>(il1);
            Set<Integer> set2 = new HashSet<>(il2);
            List<Integer> result = new ArrayList<>();

            for (Integer each : set1) {
                if (set2.contains(each))
                    result.add(each);
            }

            return result;

        };

        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,21,43,67,23,2,12,5,21,77));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(54,3,56,77,2,3,4,532,34,53,22,3));
        System.out.println(commonElements3.apply(list1, list2));

        System.out.println("-----------------------------------------");

        //Create a function that can return the common elements of two Lists of Strings
        BiFunction<List<String>,List<String>,List<String>> commonElements4 = (sl1,sl2) -> {

            Set<String> set1 = new HashSet<>(sl1);
            Set<String> set2 = new HashSet<>(sl2);
            List<String> result = new ArrayList<>();

            for (String each : set1) {
                if (set2.contains(each))
                    result.add(each);
            }

            return result;

        };

        List<String> list3 = new ArrayList<>(Arrays.asList("Irfan","Java","Alina","Loop"));
        List<String> list4 = new ArrayList<>(Arrays.asList("Irfan","Alina","Function","Loop"));
        System.out.println(commonElements4.apply(list3, list4));

    }

}
