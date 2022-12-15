package day20_Arrays;

import java.util.Scanner;

public class UniqueElements {

    public static void main(String[] args) {

        String[] word = {"Java", "Java", "C#", "C#", "Unique", "Python", "C++", "Python"};
        
        String element = "";

        for (int i = 0; i < word.length; i++) {
            int count = 0;
            for (int j = 0; j < word.length; j++) {
                if (word[i].equals(word[j])){
                    count++;
                }
            }
            if (count == 1 && !element.equals(word[i])){
                element += word[i] + " ";
            }
        }

        System.out.println(element);

    }
    
}
