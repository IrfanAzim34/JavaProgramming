package day45_Abstraction.shape;

public final class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public void setSide(double side) {
        if (side < 0){
            throw new RuntimeException("Invalid Square Side: " + side);
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", side=" + side +
                '}';
    }
}
