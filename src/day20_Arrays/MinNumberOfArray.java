package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {100, 500, 30, 40, 600, 80, 90};
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            }
        }

        System.out.println(minNumber);

    }

}
