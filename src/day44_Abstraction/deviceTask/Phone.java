package day44_Abstraction.deviceTask;

public abstract class Phone extends Device{


    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting " + phoneNum);
    }



}
