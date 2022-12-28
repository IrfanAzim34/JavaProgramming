package day43_Abstraction.shape;

public final class Rectangle extends Shape{

    private double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public void setWidth(double width) {
        if (width <= 0){
            throw new RuntimeException("Invalid Rectangle width: " + width);
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length <= 0){
            throw new RuntimeException("Invalid Rectangle length: " + length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }
}
