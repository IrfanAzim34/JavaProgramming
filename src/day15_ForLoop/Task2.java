package day15_ForLoop;

public class Task2 {

    /*
    Write a program that can return the sum of odd numbers between 1 to 100
     */

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0){
                sum += i;
            }
        }

        System.out.println("Sum = " + sum);

    }
}
