package day36_Inheritance.tasks.phoneTask;

public class Phone {

    public String brand, model, size;
    public double price;
    public String color;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling with this number: " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting with this number: " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Create a class named Phone:
    Variables:
        brand, model, size, price, color
    Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        toString()
 */