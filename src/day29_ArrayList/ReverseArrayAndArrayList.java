package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] reversed = new int[array.length];

        for (int i = 0, j = reversed.length-1; i < array.length; i++, j--) {
            reversed[j] = array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversed));

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);


    }

}
