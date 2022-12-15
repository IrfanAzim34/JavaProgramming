package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        int year = 2019;
        String make = "Audi";
        String model = "RS6";
        double miles = 1000.67;
        String color = "Nardo Grey";
        int price = 109_000;

        String carInfo = year + " " + make + " " + model + ", " + miles + " Miles, " + color + ", $" + price + ".";

        System.out.println(carInfo);

    }

}


/*
1. Create a class called CarInfo.java

2. Declare the following variables:
    1. year
    2. make
    3. model
    4. miles
    5. color
    6. price

3. Use concatenation to print the full info of the car in

the following format:
Year Make Model, Miles, Color, Price.

Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
 */