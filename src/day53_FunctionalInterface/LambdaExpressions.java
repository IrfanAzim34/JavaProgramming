package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse = s -> {

          String reverse = new StringBuilder(s).reverse().toString();
          return reverse;

        };

        System.out.println(stringReverse.method("irfan"));

        System.out.println("----------------------------------------------------");

        // create a function that can return the cube of an integer

        MyThirdFunctionalInterface<Integer> cubeOfInteger = integer -> {
            return (int) Math.pow(integer,3);
        };

        System.out.println(cubeOfInteger.method(100));

    }

}
