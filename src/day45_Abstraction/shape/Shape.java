package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid Shape Name: " + name);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'';

    }
}
