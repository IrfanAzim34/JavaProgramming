package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {

    public static void main(String[] args) {

        // Create a function that can check if the Integer is contained in an array of Integer, return boolean
        BiPredicate<Integer,int[]> isContained = (u, arr) -> {

            for (int each : arr) {
                if (each == u){
                    return true;
                }
            }
            return false;

        };

        int[] arr = {1,4,6,3,5,78,98,4,2};
        int num = 8;

        System.out.println(isContained.test(num, arr));

        System.out.println("------------------------------------------------");

        // Create a function that can check if two strings are anagram
        BiPredicate<String,String> isAnagram = (s1,s2) -> {

            String[] temp1 = s1.split("");
            String[] temp2 = s2.split("");

            Arrays.sort(temp1);
            Arrays.sort(temp2);

            return Arrays.equals(temp1,temp2);

        };

        String s1 = "abcjg";
        String s2 = "bcafg";
        System.out.println(isAnagram.test(s1, s2));

        System.out.println("-----------------------------------------------------");

        // Create a function that can print the given string for given number of times
        BiConsumer<String,Integer> printMultipleTimes = (s,n) -> {

            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }

        };

        printMultipleTimes.accept("Wooden Spoon",10);

        System.out.println("----------------------------------------------------");
        //Create a function that takes first and last names and return the formatted full name
        BiConsumer<String,String> printFullName = (s3,s4) -> {

            System.out.println(s3 + " " + s4);

        };

        printFullName.accept("Java","Programming");

        System.out.println("------------------------------------------------------");

        Map<String,String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        scrumTeam1.forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("--------------------------------------------------------");

        // Create a function that takes two integer and returns the maximum integer
        BiFunction<Integer,Integer,Integer> maxNum = (n1, n2) -> (n1 > n2)?n1 :n2;

        System.out.println(maxNum.apply(3, 2));

        System.out.println("---------------------------------------------------");

        //Create a function that can take two integer arrays and merge them into a list
        BiFunction<int[],int[], List<Integer>> mergeArraysToList = (x,y) -> {

            List<Integer> result = new ArrayList<>();

            for (int each : x) result.add(each);
            for (int each : y) result.add(each);

            return result;

        };

        int[] arr1 = {2,3,5,21,45,45,7};
        int[] arr2 = {5,7,4,6,8,84,56,8,43};
        List<Integer> list = mergeArraysToList.apply(arr1, arr2);
        System.out.println(list);

        System.out.println("------------------------------------------------------");

        // Create a function that takes a list of String and a list of Integer
        BiFunction<List<String>,List<Integer>,Map<String,Integer>> merge = (j,k) -> {

            Map<String,Integer> map = new HashMap<>();

            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i),k.get(i));
            }

            return map;

        };

        List<String> names = new ArrayList<>(Arrays.asList("Irfan","Kayser","Alina"));
        List<Integer> scores = new ArrayList<>(Arrays.asList(100,65,89));

        Map<String, Integer> names_Scores = merge.apply(names, scores);
        System.out.println(names_Scores);

    }

}
