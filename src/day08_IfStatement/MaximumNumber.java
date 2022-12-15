package day08_IfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int n1 = 100, n2 = 100;


        if (n1 > n2){
            System.out.println(n1 + " is Maximum Number.");
        } else if (n2 > n1) {
            System.out.println(n2 + " is Maximum Number.");
        }else {
            System.out.println(n1 + " and " + n2 + " is equal.");
        }

    }

}

/*
3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal
Ex:
    n1= 100, n2 = 200;
output:
    200 is maximum number
 */