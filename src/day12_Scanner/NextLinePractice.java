package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    /*
    1. Ask the user to enter age
    2. Ask the user to enter full name
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);

        input.close();

    }

}
