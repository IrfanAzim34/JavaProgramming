package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        short weight = 160;

        // salary: 100000 $
        int salary = 100_000;// int is the preferred data types for all integer numbers

        long asset = 3_333_333_333L;

        // tax: 0.26
        float tax = 0.26F;

        // PI: 3.14
        double PI = 3.14;  // double is the preferred data types for all the float-point numbers

        // print # character
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35; // by ASCII Table
        System.out.println("ch2 = " + ch2);
        char ch3 = 10084;
        System.out.println("ch3 = " + ch3);
        
        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

    }

}
