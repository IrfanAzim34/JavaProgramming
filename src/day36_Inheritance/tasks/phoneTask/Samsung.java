package day36_Inheritance.tasks.phoneTask;

public class Samsung extends Phone {

    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(brand + " " + model + " is freezing");
    }

}
/*
Create a subclass of Phone named Samsung:
    Variables:
        brand, model, size, price, color
    Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        freeze()
        toString()
 */