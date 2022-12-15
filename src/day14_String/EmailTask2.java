package day14_String;

import java.util.Scanner;

public class EmailTask2 {

    /*
    Create a class called EmailTask2.
    Assume that email address is constructed by person's first name and followed by an underscore and last name.
    Write a program that will print out information about user based on email. Print first name, last name, and domain.
    First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

                        Ex:
                            input:
                                craig_federighi@apple.com

                        Output:
                               First name: Craig
                               Last name: Federighi
                               Domain: apple
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:\n(Ex: firstname_lastname@gmail.com)");
        String email = scan.nextLine();

        int underscoreIndex = email.indexOf("_");
        int domainIndex = email.indexOf("@");

        if (0 < underscoreIndex && underscoreIndex < domainIndex){
            System.out.println("First name: " + email.substring(0,1).toUpperCase()
                                + email.substring(0,underscoreIndex).substring(1,underscoreIndex));

            System.out.println("Last name: "
                    + email.substring(underscoreIndex+1,underscoreIndex+2).toUpperCase()
                    + email.substring(underscoreIndex+2,domainIndex));

            System.out.println("Domain: " + email.substring(domainIndex+1,email.lastIndexOf(".")));
        }

    }
}
