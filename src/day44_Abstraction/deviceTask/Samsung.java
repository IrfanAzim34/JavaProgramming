package day44_Abstraction.deviceTask;

public final class Samsung extends Phone implements AndroidApps{
    public Samsung(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning On " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Off " + getBrand() + " " + getModel());
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " downloading app from " + AndroidApps.AppStoreName);
    }
}
