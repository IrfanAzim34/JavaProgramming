package day38_Inheritance.warmUp;

public class Car {

    public String brand,model;
    public int year;
    public double price;
    public String color;
    public double miles;

    public Car(String brand, String model, int year, double price, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        System.out.println("I'm starting " + brand + " " + model);
    }

    public void drive(){
        System.out.println("I'm driving " + brand + " " + model);
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}