package day38_Inheritance.shape;

public class Circle extends Shape{

    public double radius;
    static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double area(){
        return pi * radius * radius;
    }

    public double perimeter(){
        return 2 * pi * radius;
    }

    public String toString(){
        return "{" +
                "name='" + name + '\'' +
                " radius='" + radius + '\'' +
                " pi='" + pi + '\'' +
                " area='" + this.area() + '\'' +
                " perimeter='" + this.perimeter() + '\'' +
                '}';
    }

}
