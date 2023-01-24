package day50_Collections_Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveEven {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            if (iterator.next() % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println(set);

    }

}
