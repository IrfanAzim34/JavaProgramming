package day43_Abstraction.shape;

public final class Circle extends Shape{

    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new RuntimeException("Invalid Circle Radius: " + radius);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static double getPI() {
        return PI;
    }

    public double area() {
        return Math.pow(radius,2) * PI;
    }

    public double perimeter() {
        return 2 * radius * PI;
    }
}
