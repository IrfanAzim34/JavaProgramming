package day19_LoopPractice;

import java.util.Scanner;

public class Task1 {

    /*
    Write a program that can calculate the area and perimeter of a circle:
            1. Ask the user "Enter the radius of the circle:"
            if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry
            for the radius of the circle"
            2. Display:
                1. Diameter of circle
                2. Area of circle
                3. Perimeter of circle
            3. Ask the user "Would you like to calculate another circle?"
            If "yes" --> repeat the previous steps
            If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"
            If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double pi = 3.14;

        while (true){
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();

            while (radius <= 0){
                System.err.println("Invalid Entry for radius of the circle");
                System.exit(0);
            }

            double diameterOfCircle = radius * 2;
            double areaOfCircle = pi * radius * radius;
            double perimeterOfCircle = 2 * pi * radius;

            System.out.println("Diameter Of Circle = " + diameterOfCircle);
            System.out.println("Area Of Circle = " + areaOfCircle);
            System.out.println("Perimeter Of Circle = " + perimeterOfCircle);

            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid entry, please re-enter you answer");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);
            }
        }

    }

}
