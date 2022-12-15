package day19_LoopPractice;

import java.util.Scanner;

public class Task3 {

    /*
    Write a program that can calculate the area and perimeter of a Rectangle:
            1. Ask the user "Enter the length of the Rectangle:"
            if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry
            for the length of the rectangle"
            2. Ask the user "Enter the width of the Rectangle:"
            if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry
            for the width of the rectangle"
            3. Display:
                1. Area of rectangle
                2. Perimeter of rectangle
            4. Ask the user "Would you like to calculate another Rectangle?"
            If "yes" --> repeat the previous steps
            If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"
            If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter the length of the Rectangle");
            double length = scan.nextDouble();

            while (length <= 0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("Enter the width of the Rectangle");
            double width = scan.nextDouble();

            while (width <= 0){
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            double areaOfRectangle = width * length;
            double perimeterOfRectangle = (width + length) * 2;

            System.out.println("Area Of Rectangle = " + areaOfRectangle);
            System.out.println("perimeter Of Rectangle = " + perimeterOfRectangle);

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid entry, please re-enter your answer");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                System.exit(0);
            }

        }

    }

}
