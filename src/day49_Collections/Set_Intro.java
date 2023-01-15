package day49_Collections;

import java.util.*;

public class Set_Intro {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(1, 3, 6, 2, 100, 45, 23, 98, 5));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 3, 6, 2, 100, 45, 23, 98, 5));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(1,3,6,2,100,45,23,98,5));
        System.out.println(treeSet);

    }

}
