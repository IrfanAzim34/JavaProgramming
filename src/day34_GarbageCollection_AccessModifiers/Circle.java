package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public Circle(double radius){
        this.radius = radius;
//        pi = 3.14;
    }

    static {
        pi = 3.14;
        name = "Circle";
        numbers.add(1);
        numbers.add(2);
        numbers.addAll(Arrays.asList(3,4,5,6));
    }

}
