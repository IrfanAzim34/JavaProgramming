package day38_Inheritance.warmUp;

import day38_Inheritance.warmUp.Car;

public class Tesla extends Car {

    public Tesla(String model, int year, double price, String color, double miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autopilot(){
        System.out.println(brand + " " + model + " has autopilot");
    }

}