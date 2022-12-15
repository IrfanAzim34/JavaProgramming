package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    /*
    create string array, and store the names of your  classmates (10)
    reverse each student names and print them in separate line
                            ex:
                                arr = {java, python, c#}
                            output:
                                avaJ
                                nohtyp
                                #c
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] classmates = new String[10];

        String[] reverseClassmates = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a name of your classmate");
            classmates[i] = scan.nextLine();
        }

        for (int i = 0; i < classmates.length; i++) {
            String temp = "";
            for (int j = classmates[i].length()-1; j >= 0; j--) {
                temp += classmates[i].charAt(j);
            }
            reverseClassmates[i] = temp;
        }

        for (int i = 0; i < reverseClassmates.length; i++) {
            System.out.println(reverseClassmates[i]);
        }

        System.out.println(Arrays.toString(classmates));

        scan.close();

    }

}
