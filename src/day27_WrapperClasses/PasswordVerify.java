package day27_WrapperClasses;

import utilities.ArraysUtility;
import java.util.Scanner;

public class PasswordVerify {

    public static void main(String[] args) {

        /*
        Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
         */

        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        char[] array = password.toCharArray();
        int[] frequency = new int[4];

        boolean strongPassword = true;

        if (array.length >= 8 && !ArraysUtility.contains(array,' ')){

            for (char each : array) {

                if (Character.isLetter(each)){
                    if (Character.isUpperCase(each)){
                        frequency[0] += 1;
                    }else {
                        frequency[1] += 1;
                    }
                }

                if (Character.isDigit(each)){
                    frequency[2] += 1;
                }else {
                    frequency[3] += 1;
                }
            }

            if (ArraysUtility.contains(frequency,0)){
                strongPassword = false;
            }

        }else {
            strongPassword = false;
        }

        if (strongPassword){
            System.out.println("This is a strong password");
        }else {
            System.out.println("This is not a strong password");
        }

        scan.close();

    }

}
