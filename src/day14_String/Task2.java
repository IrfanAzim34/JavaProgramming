package day14_String;

import java.util.Scanner;

public class Task2 {

    /*
    ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        int length = word.length();
        String wordEnds = word.substring(length-2);

        if (wordEnds.equals("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

        scan.close();







    }

}
