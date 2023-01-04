package day44_Abstraction.deviceTask;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final String size;
    private final boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            throw new RuntimeException("Invalid Brand: " + brand);
        }
        this.brand = brand;
        if (model == null || model.isBlank() || model.isEmpty()){
            throw new RuntimeException("Invalid Model: " + model);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        if (size == null || size.isEmpty() || size.isBlank()){
            throw new RuntimeException("Invalid Size: " + size);
        }
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
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

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
