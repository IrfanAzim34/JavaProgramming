package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key  , value
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Ahmet");
        hashMap.put(5,"Isabella"); //Will put last one into Map
        hashMap.put(6,null);
        hashMap.put(7,null);
        hashMap.put(8,null);
        hashMap.put(null,"Cihad");
        hashMap.put(null,"Emrah"); //Will put last one into Map
        hashMap.put(null,"Hulya");
        System.out.println("hashMap = " + hashMap);

        System.out.println("-------------------------------------------------------");

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(5,"Isabella"); //Will put last one into Map
        linkedHashMap.put(6,null);
        linkedHashMap.put(7,null);
        linkedHashMap.put(8,null);
        linkedHashMap.put(null,"Cihad");
        linkedHashMap.put(null,"Emrah"); //Will put last one into Map
        linkedHashMap.put(null,"Hulya");
        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("--------------------------------------------------------");

        Map<Integer,String> treeMap = new TreeMap<>(); // sort by key
        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(6,null);
        treeMap.put(7,null);
        treeMap.put(8,null);
//        treeMap.put(null,"Cihad");        /*
//        treeMap.put(null,"Emrah");            Doesn't support null as key !!!
//        treeMap.put(null,"Hulya");        */
        System.out.println("treeMap = " + treeMap);

        System.out.println("--------------------------------------------------------");

        Map<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Ahmet");
        hashtable.put(5,"Isabella");
//        hashtable.put(6,null);        /*
//        hashtable.put(7,null);
//        hashtable.put(8,null);            HashTable doesn't support null as key and value both!!!
//        hashtable.put(null,"Cihad");
//        hashtable.put(null,"Emrah");
//        hashtable.put(null,"Hulya");  */
        System.out.println("hashtable = " + hashtable);

    }

}
