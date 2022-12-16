package day39_Recap.device;

public class Device {
    
    private String brand, model;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public void setBrand(String brand) {
        if (brand == null){
            System.err.println("Invalid brand: " + brand);
            System.exit(1);
        }
        
        if (brand.isBlank() || brand.isEmpty()){
            System.err.println("Invalid brand: " + brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null){
            System.err.println("Invalid model: " + model);
            System.exit(1);
        }

        if (model.isBlank() || model.isEmpty()){
            System.err.println("Invalid model: " + model);
            System.exit(1);
        }
        this.model = model;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid price: " + price);
        }
        this.price = price;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsHasBattery() {
        return hasBattery;
    }

    public boolean getIsHasPowerButton() {
        return hasPowerButton;
    }

    public void turnOn(){
        System.out.println("Turning on " + getBrand() + " " + getModel());
    }

    public void turnOff(){
        System.out.println("Turning off " + getBrand() + " " + getModel());
    }

    public String toString() {
        return "Device{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=$" + getPrice() +
                ", hasBattery=" + getIsHasBattery() +
                ", hasPowerButton=" + getIsHasPowerButton() +
                '}';
    }
}
