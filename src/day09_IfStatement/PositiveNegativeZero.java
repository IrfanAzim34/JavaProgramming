package day09_IfStatement;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        int n = 0;

        if (n > 0){
            System.out.println(n + " is positive number");
        } else if (n < 0) {
            System.out.println(n + " is negative number.");
        }else {
            System.out.println(n + " is Zero.");
        }

    }

}
