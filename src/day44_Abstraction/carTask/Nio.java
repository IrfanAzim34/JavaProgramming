package day44_Abstraction.carTask;

public final class Nio extends Car implements AutoPilot{
    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto park feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " has auto pilot feature");
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
