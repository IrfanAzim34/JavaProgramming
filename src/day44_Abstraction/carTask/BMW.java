package day44_Abstraction.carTask;

public final class BMW extends Car{
    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }
}
