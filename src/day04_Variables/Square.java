package day04_Variables;

public class Square {

    public static void main(String[] args) {

        // side, area, perimetre

        double side = 4.5;

        double area = side * side; // finds the area of the square
        double perimeter = 4 * side; // finds the perimeter of the square

        System.out.println("side = " + side);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }

}

/*
1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
						side

						area = side * side;
						perimeter = 4 * side
 */