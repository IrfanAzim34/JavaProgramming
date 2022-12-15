package day38_Inheritance;

import day38_Inheritance.warmUp.Car;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }
}