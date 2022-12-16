package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name please re-enter!");
            System.exit(0);
        }
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}
 */