package day38_Inheritance.warmUp;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void start(){
        System.out.println("Twist the key to ignition to start " + brand + " " + model);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

}
