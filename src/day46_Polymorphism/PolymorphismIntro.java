package day46_Polymorphism;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 123;

        Boolean r1 = true;

        double b2 = 5.5;

        Object[] array = {str,n1, b2, r1};
        System.out.println(Arrays.toString(array));

    }

}
