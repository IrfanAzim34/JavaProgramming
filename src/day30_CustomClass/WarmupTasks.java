package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        // write a program that can swap the first and last elements of an arraylist

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);

        Collections.swap(list,0,list.size()-1);
        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------------------------");

        /* write a program that can move all the zeros to the last indexes of ArrayList

                    EX:
                        list : {1,0,2,0,3,0,4,0}

                    output:
                        [1,2,3,4,0,0,0,0]
         */

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list1);

        int size = list1.size();
        list1.removeIf(num -> num == 0);
        int size1 = list1.size();

        for (int i = 0; i < size-size1; i++) {
            list1.add(0);
        }

        System.out.println(list1);

        System.out.println("-----------------------------------------------------------------------------------------");

        /*
        Write a program that can extract the special characters, digits and letters from a string and stores them into
        separate ArrayList

                    Ex:
                        str = "ABCD123$%#@&456EFG!"

                    output:
                        list1 : {1, 2, 3, 4, 5, 6}
                        list2 : {A, B, C, D, E, F, G}
                        list3 : {$, %, #, @, &, !}
         */

        String str = "ABCD123$%#@&456EFG!";

        char[] array = str.toCharArray();

        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (char c : array) {
            if (Character.isLetter(c)){
                letters.add(c);
            } else if (Character.isDigit(c)) {
                digits.add(c);
            } else if (!Character.isLetterOrDigit(c)) {
                specialChars.add(c);
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }

}
