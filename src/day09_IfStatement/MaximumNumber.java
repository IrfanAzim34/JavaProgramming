package day09_IfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 14,
                num2 = 76;

        boolean maximumNumber = num1 > num2;

        if (maximumNumber){
            System.out.println(num1 + " is maximum number.");
        }else {
            System.out.println(num2 + " is maximum number.");
        }

    }

}
