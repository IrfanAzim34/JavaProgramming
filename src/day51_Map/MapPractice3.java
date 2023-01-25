package day51_Map;

import java.util.*;

public class MapPractice3 {

    public static void main(String[] args) {

        /*
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangiz"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufer","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina"};
        String[] group24 = {"Maria","Kristina","Amin","George","Layan","Yulia","Ayanle","Maxim","Nermin"};
        String[] group5 = {"Nazar","Veronika","Mikeal","Layla","Badma","Zaeir","Anna","Tamara","Eugene"};
        */

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Duygu","Magda","Farangez","Edison","Kerem","Farangiz"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Margie","Vesele","Iryn","Nilufer","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList("Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maria","Kristina","Amin","George","Layan","Yulia","Ayanle","Maxim","Nermin"));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikeal","Layla","Badma","Zaeir","Anna","Tamara","Eugene"));

        Map<Integer, List<String>> groups = new TreeMap<>();

        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(9,group9);
        groups.put(24,group24);
        groups.put(5,group5);

        System.out.println(groups);

        System.out.println("-----------------------------------------------------------------");

        for (List<String> value : groups.values()) {
            for (String name : value) {
                System.out.println(name);
            }
        }

    }

}
