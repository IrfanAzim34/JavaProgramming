package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String secondName = scan.nextLine();

        System.out.println(firstName.charAt(0) + "." + secondName.charAt(0));

        scan.close();

    }
}
