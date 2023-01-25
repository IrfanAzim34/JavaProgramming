package day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<>();

        students.put("Aygun",95);
        students.put("Maria",90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",75);
        students.put("Serkan",70);
        students.put("Andriy",98);

        System.out.println("students = " + students);

        Map<String,Integer> earlyBirds = new HashMap<>();
        Map<String,Integer> angryBirds = new HashMap<>();

        for (String key : students.keySet()) {
            if (students.get(key) < 90){
                angryBirds.put(key,students.get(key));
            }else {
                earlyBirds.put(key,students.get(key));
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("---------------------------------------------------------");

//        Collection<Integer> scores = students.values();

        for (Integer value : students.values()) {
            System.out.println(+ value);
        }

        System.out.println("-------------------------------------------------------------");


        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer value : students.values()) {
            if (value > maxScore){
                maxScore = value;
            }
            if (value < minScore){
                minScore = value;
            }
        }

        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("--------------------------------------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------------");

        int count = 0;


//        for (Integer eachScore : students.values()) {
//            if (eachScore >= 95){
//                count += 1;
//            }
//        }

        for (String eachKey : students.keySet()) {
            if (students.get(eachKey) >= 95)
                count++;
        }

        System.out.println(count);

        System.out.println("------------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
