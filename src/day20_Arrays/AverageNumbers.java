package day20_Arrays;

public class AverageNumbers {

    public static void main(String[] args) {

        int[] numbers = {15, 20, 36 ,40 ,58, 60};

        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        double average = total / numbers.length;

        System.out.println(average);

    }

}
