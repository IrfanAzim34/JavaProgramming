package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi;

    static{
        pi = 3.14;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            return;
        }
        this.radius = radius;
    }

    public double calcArea(){
        return pi * radius * radius;
    }

    public double calcPerimeter(){
        return pi* radius * 2;
    }

    public String toString() {
        return "Circle{" +
                " radius=" + radius + "/" +
                " area=" + calcArea() + "/" +
                " perimeter=" + calcPerimeter() +
                '}';
    }
}
