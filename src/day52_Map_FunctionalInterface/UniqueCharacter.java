package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        Map<String,Integer> result = new LinkedHashMap<>();

        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if (frequency == 1){
                result.put(each,1);
            }
        }

        System.out.println(result);


    }

}
