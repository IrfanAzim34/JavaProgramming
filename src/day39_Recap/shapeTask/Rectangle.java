package day39_Recap.shapeTask;

public class Rectangle extends Shape{

    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            System.err.println("Invalid Rectangle length, please re-enter");
            System.exit(0);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (length <= 0){
            System.err.println("Invalid Rectangle width, please re-enter");
            System.exit(1);
        }
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + getName() + '\'' +
                " length='" + getLength() + '\'' +
                " width='" + getWidth() + '\'' +
                " area='" + area() + '\'' +
                " perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */