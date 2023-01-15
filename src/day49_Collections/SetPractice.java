package day49_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon","Book","Pen","Phone","Wooden Spoon","Wooden Spoon","Wooden Spoon","Wooden Spoon",
                        "Milk","Eggs","Coke","Paper Towels"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,500,600,10,10,20,30,40,30,20,10));
        System.out.println(list);

        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------");

        String [] array = {"A","A","B","C"};
        Set<String> s = new LinkedHashSet<>(Arrays.asList(array));
        array = s.toArray(new String[0]);

        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------------------------------------");

        String str = "aaaabbbbccccdddeeeee";
        String result = "";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(Arrays.asList(str.split("")),each);;
        }

        System.out.println(result);

    }

}
