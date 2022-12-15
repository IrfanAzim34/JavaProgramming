package day14_String;

import java.util.Scanner;

public class AccountNumber {

    /*
    Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.

               If the account number begins with a “2” the account number should be 7 characters long

               If the account number begins with a “5” the account number should be 10 characters long

               If the account number does not begin with a 2 or a 5 OR the account number lengths do not
               meet the expected results print “Invalid account number”
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, Enter Account Number:");
        String accountNum = scan.nextLine();
        int numberLenght = accountNum.length();
        boolean valid = (accountNum.substring(0,1).equals("2") && numberLenght == 7)
                        || (accountNum.substring(0,1).equals("5") && numberLenght == 10);

        if (valid){
            System.out.println("Valid Account Number");
        }else {
            System.out.println("Invalid Account Number");
        }


        scan.close();

    }
}
