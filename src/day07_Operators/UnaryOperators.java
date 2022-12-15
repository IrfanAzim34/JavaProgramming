package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        System.out.println(num1 < 0);
        System.out.println(num2 < 0);

        System.out.println("-----------------------------------------------------------------------------------------");

        int a =25;
        System.out.println(++a); // pre increment: increases the value by 1 right away
        System.out.println(--a); // pre decrement: decreases the value by 1 right away

        System.out.println("-----------------------------------------------------------------------------------------");

        int b = 100;
        System.out.println(b++); // post increment: first passes the current value, then increases the value by 1
        System.out.println(b); // 101

    }

}
