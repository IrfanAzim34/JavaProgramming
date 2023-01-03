package day45_Abstraction.shape;

public final class Circle extends Shape{

    private double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius < 0){
            throw new RuntimeException("Invalid Circle Radius: " + radius);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(radius,2) * PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                ", radius=" + radius +
                '}';
    }
}
