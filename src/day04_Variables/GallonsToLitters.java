package day04_Variables;

public class GallonsToLitters {

    public static void main(String[] args) {

        // convert gallons to litters

        int gallons_01 = 1000;
        int gallons_02 = 10000;

        double litters_01 = gallons_01 * 3.79; // convert 1000 gallons to litters
        double litters_02 = gallons_02 * 3.79; // convert 10000 gallons to litters

        System.out.println("litters_01 = " + litters_01);
        System.out.println("litters_02 = " + litters_02);

    }

}


/*
5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
					Hints: 1 gallon = 3.79 litters
 */