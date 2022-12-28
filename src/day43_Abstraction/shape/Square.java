package day43_Abstraction.shape;

public final class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public void setSide(double side) {
        if (side <= 0){
            throw new RuntimeException("Invalid Square side: " + side);
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public double area() {
        return Math.pow(side,2);
    }

    public double perimeter() {
        return 4 * side;
    }
}
