package day52_Map_FunctionalInterface;

// lambda: () -> {}

public class Test {

    public static void main(String[] args) {

        // function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = n -> {

            if (n % 2 == 0){
                System.out.println(n + " is even number");
            }else {
                System.out.println(n + "is odd number");
            }

        };

        oddOrEvenNumber.apply(20);

        // function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleBuyAlcohol = age -> {
            if (age >= 18){
                System.out.println("Eligible to buy alcohol");
            }else {
                System.out.println("Not eligible to buy alcohol");
            }
        };

        eligibleBuyAlcohol.apply(20);

        // function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface printCube = n -> System.out.println(Math.pow(n,3));

        printCube.apply(2);

        // function4: create a function that can check if a number is evenly divisible by 3 and 5

        MyFirstFunctionalInterface divisibleBy3and5 = n -> {
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println(n + " is divisible By 3 and 5");
            else
                System.out.println(n + " is not divisible By 3 and 5");
        };

        divisibleBy3and5.apply(15);

    }

}
