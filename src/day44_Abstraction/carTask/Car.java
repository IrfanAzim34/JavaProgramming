package day44_Abstraction.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make == null || make.isEmpty() || make.isBlank()){
            throw new RuntimeException("Invalid Make: " + make);
        }
        this.make = make;
        if (model == null || model.isEmpty() || model.isBlank()){
            throw new RuntimeException("Invalid Model: " + model);
        }
        this.model = model;
        if (year < 1886){
            throw new RuntimeException("Invalid Year: " + year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new RuntimeException("Invalid Price: " + price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()){
            throw new RuntimeException("Invalid Color: " + color);
        }
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(make + " " + model + " is stopping");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
