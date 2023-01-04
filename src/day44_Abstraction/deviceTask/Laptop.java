package day44_Abstraction.deviceTask;

public final class Laptop extends Computer{
    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning On " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Off " + getBrand() + " " + getModel());
    }
}
