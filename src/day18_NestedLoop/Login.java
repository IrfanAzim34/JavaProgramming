package day18_NestedLoop;

import java.util.Scanner;

public class Login {

    /*
    You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

        Ask the user to enter their credentials.
           If credentials are matched, your program should print "Logged in."
           If the credentials are not matched, the program should allow the user to have three attempts
           to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("username: ");
        String username = scan.next();

        System.out.println("password: ");
        String password = scan.next();

        int attempts = 0;
        String result = "";

        while (!(username.equals("Cydeo") && password.equals("WoodenSpoon")) && attempts < 3){
            System.err.println("Invalid Username and Password, please re-enter");
            System.out.println("username: ");
            username = scan.next();

            System.out.println("password: ");
            password = scan.next();

            ++attempts;
        }

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            result = "Logged in";
        }else {
            result = "Your account is locked";
        }

        System.out.println(result);

        scan.close();

    }

}
