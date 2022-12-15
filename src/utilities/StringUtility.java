package utilities;

import java.util.Arrays;

public class StringUtility {

    // prints each character of the given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }


    // reverses the given string and returns the reversed string
    public static String reverseString(String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;

    }

    // if the given string is palindrome return true,else return false
    public static boolean isPalindrome(String str){

        str = str.toLowerCase();

        for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }

        return true;

    }

    // if the given string is anagram return true, else return false
    public static boolean isAnagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    // remove the duplicates from given string, return string
    public static String removeDuplicates(String str){

        String removedDuplicate = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(removedDuplicate.contains(""+str.charAt(i)))){
                removedDuplicate += str.charAt(i);
            }
        }

        return removedDuplicate;

    }


}
