package day12_Scanner;

import java.util.Scanner;

public class ConvertMilesToKM {

    /*
    Write a program that can convert Miles to KM
                    Ex:
                Enter miles:
                10.0
                    output:
                10.0 miles equal to 16.09 kilometers
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Miles: ");
        double miles = input.nextDouble();
        double km = miles * 1.609;

        System.out.println(miles + " miles equal to " + km + " kilometers");

        input.close();

    }
}
