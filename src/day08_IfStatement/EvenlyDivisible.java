package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        int divisibleBy2 = 65 % 2;
        int divisibleBy3 = 65 % 3;
        int divisibleBy5 = 65 % 5;

        boolean result2 = divisibleBy2 == 0;
        boolean result3 = divisibleBy3 == 0;
        boolean result5 = divisibleBy5 == 0;

        System.out.println(number + " is divisible by 2: " + result2);
        System.out.println(number + " is divisible by 3: " + result3);
        System.out.println(number + " is divisible by 5: " + result5);

    }

}

/*
Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */