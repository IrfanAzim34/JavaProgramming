package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Invalid Square side, please re-enter");
            System.exit(1);
        }
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return  4 * side;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + getName() + '\'' +
                " side='" + getSide() + '\'' +
                " area='" + area() + '\'' +
                " perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */