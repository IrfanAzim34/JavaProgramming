package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle and show the area and perimeter of circle: ");

        double radius = input.nextDouble(),
                pi = 3.14;

        System.out.println("Area: " + (radius * radius * pi));
        System.out.println("Perimeter: " + (2 * pi * radius));

        input.close();

    }

}
