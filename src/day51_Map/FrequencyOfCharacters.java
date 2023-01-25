package day51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaac";

        String[] arr = str.split("");

        Map<String,Integer> map = new LinkedHashMap<>();

        for (String each : arr) {
            map.put(each, Collections.frequency(Arrays.asList(arr),each));
        }

        System.out.println(map);

    }

}
