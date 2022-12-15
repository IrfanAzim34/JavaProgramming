package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Character> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList('A','B','C','D','E'));

        System.out.println(list1);

        Collections.reverse(list1);
        System.out.println(list1);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list2,1,2);

        System.out.println(list2);

        System.out.println("-----------------------------------------------------------------------------------------");

        int max = Collections.max(list2);
        int min = Collections.min(list2);
        System.out.println(max);
        System.out.println(min);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        System.out.println(list3);

        Collections.replaceAll(list3,10,100);

        System.out.println(list3);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,20,30,40,20,10,30,40,50,20));

        int frequency = Collections.frequency(list4,10);
        System.out.println(frequency);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<String> list5 = new ArrayList<>();

        list5.addAll(Arrays.asList("Java", "Java", "Python", "C++", "C#", "Python"));

        int countJava = Collections.frequency(list5,"Java");
        int countPython = Collections.frequency(list5,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }

}
