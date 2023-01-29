package day53_FunctionalInterface.task;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTask {

    public static void main(String[] args) {

        //Write a program that can remove the duplicated elements of an array of String
        Function<String[],List<String>> removeDuplicated1 = sa -> Arrays.stream(sa).distinct().collect(Collectors.toList());

        String[] arr1 = {"Irfan","Irfan","Java","Python","Java"};
        System.out.println(removeDuplicated1.apply(arr1));

        System.out.println("-----------------------------------------");

        //Write a program that can remove the duplicated elements of a List of String
        Function<List<String>,List<String>> removeDuplicated2 = ls -> ls.stream().distinct().collect(Collectors.toList());

        List<String> list1 = new ArrayList<>(Arrays.asList("Irfan","Irfan","Java","Python","Java"));
        System.out.println(removeDuplicated2.apply(list1));

        System.out.println("------------------------------------------");

        /*
        Write a program that can count how many "java" and "python" does the array has:
                    ex: array = {"Java", "jAVa", "pythON"}

                    output:
                        countJava = 2
                        countPython = 1
         */
        Function<String[],Map<String,Long>> countJavaAndPython = sa -> {

            Map<String,Long> result = new HashMap<>();
            result.put("Java",Arrays.stream(sa).filter(p -> p.equalsIgnoreCase("java")).count());
            result.put("Python",Arrays.stream(sa).filter(p -> p.equalsIgnoreCase("python")).count());

            return result;
        };

        String[] arr = {"Java", "jAVa", "pythON"};
        System.out.println(countJavaAndPython.apply(arr));

        System.out.println("-------------------------------------------------------------");

        /*
        Write a program that can count how many negative numbers does the array has
                ex: arr = {1,2,3,4,-4,5,-5}
                output: 2
         */
        Function<int[],Long> countNegative = ia1 -> {

            long count = 0;
            return count = Arrays.stream(ia1).filter(p -> p < 0).count();

        };

        int[] arr2 = {1,2,3,4,-4,5,-5};
        System.out.println(countNegative.apply(arr2));

        System.out.println("----------------------------------------------------------------");

        /*
        Write a program that can count how many Positive numbers does the List has
                    ex: List = {1,2,3,4,-4,5,-5}
                    output: 5
         */
        Function<int[],Long> countPositive = ia2 -> {

            long count = 0;
            return count = Arrays.stream(ia2).filter(p -> p > 0).count();

        };

        System.out.println(countPositive.apply(arr2));

        System.out.println("-----------------------------------------------------------------");

        /*
        Wirte a program that can return all the negative numbers of the array as a new array
                    ex:
                        arr = {1,2,3,4,-4,5,-5}
                    output:
                        {-4, -5}
         */
        Function<int[],int[]> negativeArray = ia3 -> {

            int[] result = new int[(int) Arrays.stream(ia3).filter(p -> p < 0).count()];

            return result = Arrays.stream(ia3).filter(p -> p < 0).toArray();

        };

        System.out.println(Arrays.toString(negativeArray.apply(arr2)));

        System.out.println("------------------------------------------------------");

        /*
        Write a program that can return all the positive numbers of List without the duplcaites
                ex:
                    list = {1,2,3,4,-4,5,-5,1,2,3,4}
                output:
                    {1,2,3,4,5}
         */
        Function<List<Integer>,List<Integer>> positiveUniqueList = il -> {

            Set<Integer> set = new LinkedHashSet<>(il);

            return set.stream().filter(p -> p > 0).collect(Collectors.toList());

        };

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,-4,5,-5,1,2,3,4));
        System.out.println(positiveUniqueList.apply(list));

        System.out.println("-------------------------------------------------------");

        /*
        Write a program that can return the palindrome Strings from a list:
                    Ex:
                        list = {"Java", "level", "Anna", "Wooden Spoon"};
                    output:
                        {"level", "Anna"}
         */
        Predicate<String> palindrome = s -> {
            s = s.toLowerCase();
            for (int i = 0, j = s.length()-1; i < s.length()/2; i++,j--) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
            }

            return true;

        };

        List<String> list2 = new ArrayList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon"));
        System.out.println(list2.stream().filter(palindrome).collect(Collectors.toList()));

        System.out.println("------------------------------------------------------");

        /*
        Write a program that can return the unique elements of an array as a new array:
                    Ex: arr = {1,1,2,3,3,4,5,5,6};
                    output:
                        {2,4,6}
         */
        Function<int[],int[]> uniqueElements = ia -> {
            List<Integer> temp = new ArrayList<>();
            for (int each : ia) {
                temp.add(each);
            }
            return Arrays.stream(ia).filter(p -> Collections.frequency(temp,p) == 1).toArray();
        };

        int[] numbers = {1,1,2,3,3,4,5,5,6};
        System.out.println(Arrays.toString(uniqueElements.apply(numbers)));

    }

}
