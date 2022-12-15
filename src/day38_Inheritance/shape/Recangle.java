package day38_Inheritance.shape;

public class Recangle extends Shape{

    public double length, width;

    public Recangle(double length, double width) {
        super("rectangle");
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2 * (length + width);
    }

    public String toString(){
        return "{" +
                "name='" + name + '\'' +
                " length='" + length + '\'' +
                " width='" + width + '\'' +
                " area='" + this.area() + '\'' +
                " perimeter='" + this.perimeter() + '\'' +
                '}';
    }
}
