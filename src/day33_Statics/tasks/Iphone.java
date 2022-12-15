package day33_Statics.tasks;

public class Iphone {

    public String model;
    public double price;
    public String color, size;

    public static String brand = "Apple", OS = "IOS", madeIn = "China";

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println("Use " + color + " " + brand + " " + model + " facetime with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("Use " + color + " " + brand + " " + model + " facetime with " + email);
    }

    public void call(long phoneNumber){
        System.out.println("Use " + color + " " + brand + " " + model + " calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Use " + color + " " + brand + " " + model + " texting " + phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", OS='" + OS + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
/*
Creat a class named IPhone:
    Attributes:
        instance: model, price, color, size
        statics: brand, OS, madeIn
    Add a constructor that can set All the fields (instances)
    Actions:
        faceTime(long phoneNumber)
        faceTime(String email)
        call(long phoneNumber)
        text(long phoneNumber)
        toString()
 */