package day20_Arrays;

import java.util.Scanner;

public class Task1 {

    /*
    create an array named classmates, and store 10 of your classmates' full names
    print the initials of each classmate in separate lines
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] classmates = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter you classmate's name");
            classmates[i] = scan.nextLine();
        }

        System.out.println("Classmates names: ");

        for (int i = 0; i < classmates.length; i++) {
            System.out.println("--" + classmates[i]);
        }

        scan.close();

    }

}
