package day38_Inheritance.warmUp;

public class BMW extends Car{

    public BMW(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }

    public void breakdown(){
        System.out.println(brand + " " + model + " is breaking down");
    }

    public void racing(){
        System.out.println(brand + " " + model + " is racing");
    }

}
