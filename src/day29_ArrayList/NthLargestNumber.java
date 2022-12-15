package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,5,5,6,7,8));

        int n = 5;
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Collections.max(numbers);
            numbers.remove(Collections.max(numbers));
        }

        System.out.println(n + "th largest number is " + max);



    }

}
