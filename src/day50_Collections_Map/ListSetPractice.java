package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

        System.out.println("-------------------------------------------------");

        // pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));
        System.out.println(chars);

        ((Stack)chars).pop();
        System.out.println(chars);

        System.out.println("--------------------------------------------------");

        //poll() ==> FIFO
        List<String> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList("James","Jimmy","kathy","Breanna","Max"));
        System.out.println(list1);

        ((LinkedList<String>) list1).poll();
        System.out.println(list1);

    }

}
