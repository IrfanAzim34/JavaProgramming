package day47_Polymorphism;

import day45_Abstraction.shape.*;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Shape shape = new Circle(4); // UpCasting

        Circle circle = (Circle) shape; // DownCasting

    }

}
