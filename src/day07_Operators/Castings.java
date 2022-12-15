package day07_Operators;

public class Castings {

    /*
    1. declare a variable of float named averageScore and initialize it to 20.5
    2. declare teh following variables and assign averageScore to each of them
     */

    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte num1 = (byte) averageScore;
        System.out.println(num1);

        short num2 = (short) averageScore;
        System.out.println(num2);

        int num3 = (int) averageScore;
        System.out.println(num3);

        long num4 = (long) averageScore;
        System.out.println(num4);

        float num5 = averageScore;
        System.out.println(num5);

        double num6 = averageScore;
        System.out.println(num6);

    }

}
