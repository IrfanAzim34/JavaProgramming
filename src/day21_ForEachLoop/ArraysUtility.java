package day21_ForEachLoop;


import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------------------------------------------------------------------------------");

        int[] scores = {95, 100, 55, 65 ,85, 78};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        String[] names = {"Gunay", "Anna", "Ahmet", "Zuhal", "Maria", "Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------------------------------------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        System.out.println(Arrays.equals(arr1,arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println("-----------------------------------------------------------------------------------------");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        System.out.println(Arrays.equals(ch1,ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));

    }
}
