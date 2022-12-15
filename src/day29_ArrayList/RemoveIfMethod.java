package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf(p -> p < 5); // Lambda Expression

        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list1);

        list1.removeIf(p ->  p % 2 == 0);

        System.out.println(list1);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Java", "Python", "javaScript", "C#", "C++", "Java", "Java"));

        list2.removeIf(p -> p.toLowerCase().startsWith("J"));
//        list2.removeIf(p -> p.contains("Java"));
        System.out.println(list2);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf(p -> StringUtility.isPalindrome(p));
        System.out.println(names);

    }

}
