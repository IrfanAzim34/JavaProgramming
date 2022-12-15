package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        // length, width, area, perimeter

        double length = 6.7;
        double width = 8.6;

        double area = length * width; // finds the area of the rectangle
        double perimeter = 2 * (length + width); // finds the perimeter of the rectangle

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }

}

/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */