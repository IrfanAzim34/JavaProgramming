package day24_CustomMethods_Return;

import java.util.Arrays;

public class Task2 {

    /*
    create a method named isAnagram that passes two String parameters, the method returns true
    if the given two strings are anagram, otherwise returns false

                                Ex:
                                    str1 = "cba"
                                    str2 = "bac";
                                    isAnagram(str1, str2) ====> true
     */

    public static void main(String[] args) {

        String str1 = "cbc";
        String str2 = "bac";

        boolean isAnagram = isAnagram(str1,str2);
        System.out.println(isAnagram);

    }

    public static boolean isAnagram(String str1, String str2){

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if(!(arr1[i].equals(arr2[i])))
                return false;
        }

        return true;

    }

}
