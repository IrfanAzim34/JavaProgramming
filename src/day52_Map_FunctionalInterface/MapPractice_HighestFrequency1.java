package day52_Map_FunctionalInterface;

import java.util.*;

public class MapPractice_HighestFrequency1 {


    public static void main(String[] args) {

        String str = "eeeeaaabbbbccccdd";

        List<String>  list = new ArrayList<>(Arrays.asList(str.split("")));

        Map<String,Integer> map = new HashMap<>();

        for (String each : list) {

            map.put(each,Collections.frequency(list,each));

        }

        System.out.println(map);

        int maxFrequency = 0;
        String maxFrequencyCharacters = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                maxFrequencyCharacters = entry.getKey();
            } else if (entry.getValue() == maxFrequency) {
                maxFrequencyCharacters += "," + entry.getKey();
            }
        }

        if (maxFrequencyCharacters.length() == 1){
            System.out.println("Character " + maxFrequencyCharacters + " has highest frequency");
        } else {
            System.out.println("Characters " + maxFrequencyCharacters + " have highest frequency");
        }

    }

}
