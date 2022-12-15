package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeef";
        String[] array = str.split("");

        ArrayList<String> strings = new ArrayList<>(Arrays.asList(array));

        ArrayList<String> uniqueChar = strings;

        uniqueChar.removeIf(p -> Collections.frequency(uniqueChar,p) > 1);

        System.out.println("uniqueChar = " + uniqueChar);

    }

}
