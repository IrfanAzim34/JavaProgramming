package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(
                Arrays.asList("Java","Python","Cydeo","Car","Level","Civic","Radar","Rotor","Madam")
        );

        Iterator<String > iterator = list.iterator();

        while (iterator.hasNext()){
            String temp = iterator.next();
            String reverse = "";
            for (int i = temp.length()-1; i >= 0; i--) {
                reverse += temp.charAt(i);
            }
            if (temp.equalsIgnoreCase(reverse)){
                iterator.remove();
            }
        }

        System.out.println(list);

        System.out.println("------------------------------------------------------");

        List<String> list1 = new ArrayList<>();
        list1.addAll(
                Arrays.asList("Java","Python","Cydeo","Car","Level","Civic","Radar","Rotor","Madam")
        );

        /*
        Predicate<String> palindrome = str -> {
            String reverse = "";
            for (int i = str.length()-1; i >= 0; i--) {
                reverse += str.charAt(i);
            }

            return reverse.equalsIgnoreCase(str);
        };

        list1.removeIf(palindrome);
        System.out.println(list1);
         */

    }

}
