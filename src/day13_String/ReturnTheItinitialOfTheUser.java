package day13_String;

import java.util.Scanner;

public class ReturnTheItinitialOfTheUser {

    /*
    write a program that can return the initials of the user

                                ex:
                                    cybertek
                                    school
                                output:
                                    C.S

        Note: Pay attention to the example output
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter last name:");
        String lastName = scan.nextLine();

        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0));

        scan.close();

    }
}
