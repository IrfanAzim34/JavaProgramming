package day45_Abstraction.shape;

public final class Cylinder extends Shape implements Volume{

    private double radius, height;

    private final static double PI = 3.14;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public void setRadius(double radius) {
        if (radius < 0){
            throw new RuntimeException("Invalid Cylinder Radius: " + radius);
        }
        this.radius = radius;
    }

    public void setHeight(double height) {
        if (height < 0){
            throw new RuntimeException("Invalid Cylinder Height: " + height);
        }
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (2 * PI * radius * height) + (2 * PI + Math.pow(radius,2));
    }

    @Override
    public double perimeter() {
        return (4 * radius) + (2 * height);
    }
    @Override
    public double volume() {
        return PI * height * Math.pow(radius,2);
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ", radius=" + radius +
                ", height=" + height +
                ", volume=" + volume() +
                '}';
    }


}
