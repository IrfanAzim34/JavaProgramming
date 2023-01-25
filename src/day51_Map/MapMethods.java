package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        // student name & score
        Map<String,Integer> students = new HashMap<>();

        students.put("Aygun",85);
        students.put("Maria",86);
        students.put("Ali",85);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        System.out.println(students);

        // display the value of Alex:
        System.out.println(students.get("Alex"));

        // replace Ali's score to 90
        students.replace("Ali",90);

        System.out.println(students);

        // remove the value by key reference
        students.remove("Alex");
        System.out.println(students);

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);

        boolean r3 = students.containsValue(100);
        boolean r4 = students.containsValue(98);
        System.out.println(r3);
        System.out.println(r4);

        boolean r5 = students.isEmpty();
        System.out.println(r5);

        System.out.println("----------------------------------------------");

        Map<String,Integer> map1 = new HashMap<>();
        map1.putAll(students);
        Map<String,Integer> map2 = new HashMap<>();
        map2.putAll(students);
        boolean r6 = map1.equals(map2);
        System.out.println(r6);

        System.out.println("---------------------------------------------");

        map1.clear();
        map2.clear();
        System.out.println(map1);
        System.out.println(map2);


    }

}
