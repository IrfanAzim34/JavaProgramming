package day44_Abstraction.carTask;

public final class Mercedes extends Car implements AutoPark{
    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " is starting");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " has auto park feature");
    }
}
