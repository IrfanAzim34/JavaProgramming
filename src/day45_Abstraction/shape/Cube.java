package day45_Abstraction.shape;

public final class Cube extends Shape implements Volume{

    private double edge;

    public Cube(double edge) {
        super("Cube");
        setEdge(edge);
    }

    public void setEdge(double edge) {
        if (edge < 0){
            throw new RuntimeException("Invalid Cube Edge: " + edge);
        }
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double area() {
        return 6 * Math.pow(edge,2);
    }

    @Override
    public double perimeter() {
        return 12 * edge;
    }

    @Override
    public double volume() {
        return Math.pow(edge,3);
    }
    @Override
    public String toString() {
        return "Cube{" +
                super.toString() +
                ", edge=" + edge +
                ", volume=" + volume() +
                '}';
    }
}
