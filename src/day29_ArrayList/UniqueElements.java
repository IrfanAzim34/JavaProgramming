package day29_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer integer : list) {
            if (Collections.frequency(list,integer) == 1){
                unique.add(integer);
            }
        }

        System.out.println("unique = " + unique);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique1 = new ArrayList<>();

        list1.removeIf(p -> Collections.frequency(list1,p) > 1);
        unique1 = list1;

        System.out.println("unique1 = " + unique1);

    }

}
