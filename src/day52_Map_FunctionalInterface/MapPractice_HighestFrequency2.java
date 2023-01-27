package day52_Map_FunctionalInterface;

import java.util.*;

public class MapPractice_HighestFrequency2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("java","java","python","c#"));

        Map<String,Integer> map = new HashMap<>();

        for (String each : list) {
            map.put(each,Collections.frequency(list,each));
        }

        System.out.println(map);

        int highestFrequency = 0;
        String highestFrequencyWords = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highestFrequency){
                highestFrequency = entry.getValue();
                highestFrequencyWords = entry.getKey();
            } else if (entry.getValue() == highestFrequency) {
                highestFrequencyWords += "," + entry.getKey();
            }
        }


        System.out.println(highestFrequencyWords + " have highest frequency");

    }

}
