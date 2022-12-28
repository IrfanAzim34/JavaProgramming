package day43_Abstraction.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            throw new RuntimeException("Invalid shape name: " + name);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
