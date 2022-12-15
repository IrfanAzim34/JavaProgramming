package day28_ArrayList;

import java.util.ArrayList;

public class Task5 {

    /*
    Write a program that can find the maximum number from an ArrayList of integers
                    Ex:
                        list = [1,2,3,4,5];
                    output:
                        5
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = 0;

        for (Integer integer : list) {
            if (integer > max)
                max = integer;
        }

        System.out.println(max);

    }

}
