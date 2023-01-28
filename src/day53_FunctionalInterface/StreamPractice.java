package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8,9,9,3,4,6,7,3,3));
        list1 = list1.stream().distinct().collect(Collectors.toList());

        System.out.println(list1);

        System.out.println("---------------------------------------------");

        int[] arr1 = {1,2,4,5,6,7,8,9,9,3,4,6,7,3,3};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8,9,9,3,4,6,7,3,3));
        list2 = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("----------------------------------------------");

        int[] arr2 = {1,2,4,5,6,7,8,9,9,3,4,6,7,3,3};
        arr2 = Arrays.stream(arr2).skip(5).toArray();
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8,9,9,3,4,6,7,3,3));
        list3 = list3.stream().limit(6).collect(Collectors.toList());
        System.out.println(list3);

        System.out.println("----------------------------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8,9,9,3,4,6,7,3,3));
        list4 = list4.stream().map(p -> p * 10).collect(Collectors.toList());
        System.out.println(list4);

        System.out.println("-----------------------------------------------");

        List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        days = days.stream().map(p -> p.substring(0,3)).collect(Collectors.toList());
        System.out.println(days);

        System.out.println("-----------------------------------------------");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8,9,9,3,4,6,7,3,3));
        List<Integer> evenNumbers = list5.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println("-----------------------------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Java","java","jAvA","Python","Ruby"));
        long totalJava = names.stream().filter(p -> p.equalsIgnoreCase("java")).count();
        System.out.println(totalJava);

        System.out.println("-----------------------------------------------");

        names.stream().filter(p -> p.equalsIgnoreCase("java")).forEach(p -> System.out.println(p));

        System.out.println("-----------------------------------------------");

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,8,9,9,3,4,6,7,3,30));
        System.out.println(list6.stream().allMatch(p -> p % 2 == 0));
        System.out.println(list6.stream().anyMatch(p -> p > 20));
        System.out.println(list6.stream().noneMatch(p -> p == 34));

    }

}
