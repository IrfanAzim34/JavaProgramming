package day09_IfStatement;

public class MinimumNumber {

    public static void main(String[] args) {

        int num1 = 48,
                num2 = 78;

        boolean minimumNumber = num1 < num2;

        if (minimumNumber){
            System.out.println("Minimum Number = " + num1);
        }else {
            System.out.println("Minimum Number = " + num2);
        }

    }

}
