package day38_Inheritance.shape;

public class Square extends Shape{

    public double side;

    public Square(double side) {
        super("square");
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }

    public String toString(){
        return "{" +
                "name='" + name + '\'' +
                " side='" + side + '\'' +
                " area='" + this.area() + '\'' +
                " perimeter='" + this.perimeter() + '\'' +
                '}';
    }
}
