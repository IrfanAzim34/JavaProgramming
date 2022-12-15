package day14_String;

import java.util.Scanner;

public class EmailTask1 {

    /*
    Create a class calledEmailTask1.

    Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Seperated by an underscore).
    If the email doesn't contain an underscore print the given input email.
                            Ex:
                                input: mike_tyson@gmail.com
                                output: tyson_mike@gmail.com
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:\n(Ex: Firstname_Lastname@gmail.com)");
        String email = scan.nextLine();

        int underscoreIndex = email.indexOf("_");
        int domainIndex = email.indexOf("@");

        if (0 < underscoreIndex && underscoreIndex < domainIndex){
            System.out.println(email.substring(underscoreIndex+1,domainIndex) + "-" + email.substring(0,underscoreIndex)
                                + email.substring(domainIndex));
        }else {
            System.out.println(email);
        }

        scan.close();

    }
}
