package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // remove all the elements that are less than 4
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------------------");

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // remove all the elements that are less than 4
        Iterator<Integer> it = list1.iterator();

        while (it.hasNext()){
            if (it.next() < 4){
                it.remove();
            }
        }

        System.out.println(list1);

    }

}
