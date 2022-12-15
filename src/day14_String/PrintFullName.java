package day14_String;

import java.util.Scanner;

public class PrintFullName {

    /*
    Write a program that asks user to enter first and last names, and then prints the full name in regular format
    (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.next();

        System.out.println("Enter your last name:");
        String lastName = scan.next();

        String fName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Full Name: " + fName + " " + lName);

        scan.close();

    }
}
