package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach = s -> {

            for (String each : s.split("")) {

                System.out.println(each);

            }

        };

        printEach.test("Irfan");

        System.out.println("-------------------------------------------------");

        MySecondFunctionalInterface<Integer> cube = n -> System.out.println(Math.pow(n, 3));

        cube.test(2);
    }

}
