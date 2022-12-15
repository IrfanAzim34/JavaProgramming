package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    /*
    1. Enter your full name
    2. Enter your building number
    3. Enter your street name
    4. Enter your city name
    5. Enter state
    6. Enter your zip code

    Display the shipping address

    John Smith
    7925 Jones Branch Dr
    McLean, VA 22012
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street number: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.next();

        System.out.println("Enter your zip code: ");
        String zipCode = input.next();

        System.out.println(fullName + "\n" + buildingNumber + " " + streetName + "\n" + cityName + ", " + state +
                " " + zipCode);

        input.close();

    }

}
