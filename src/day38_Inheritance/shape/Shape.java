package day38_Inheritance.shape;

public class Shape {

    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
