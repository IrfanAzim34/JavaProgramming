package day50_Collections_Map;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed","aHmEd","John","Ercon","Daniel","Mustafa","Mohammed","Ahmed","ahmed","Yulia"));

        //Remove all the names "ahmed"

//        names.removeIf(p-> p.equalsIgnoreCase("ahmed"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("---------------------------------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,3,4,5,1,2,5,8,7,10));

        Iterator<Integer> it1 = set.iterator();

        while (it1.hasNext()){
            if (it1.next() < 4){
                it1.remove();
            }
        }

        System.out.println(set);

    }

}
