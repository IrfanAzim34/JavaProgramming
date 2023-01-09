package day46_Polymorphism.carsTask;

public abstract class Car {

    private final String model;
    private final int year;
    private double price;
    private String color;
    private final int mileage;

    public Car(String model, int year, double price, String color, int mileage) {
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
        if (mileage < 0){
            throw new RuntimeException("Invalid Mileage: " + mileage);
        }
        this.mileage = mileage;
    }

    public void setPrice(double price) {
        if (price <= 0){
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

    public int getMileage() {
        return mileage;
    }
    
    public abstract void recall();
    public void lowMileage(){
        if (getMileage() < 30000){
            System.out.println(toString());
        }
    }
    public void highMileage(){
        if (getMileage() >= 30000){
            System.out.println(toString());
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
