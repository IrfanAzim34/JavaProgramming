package day29_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,5,5,5,5,8,8,8,8));
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));
        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(100, 200, 300));
        System.out.println(numbers);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.containsAll(Arrays.asList(1, 5, 10, 100));
        System.out.println(r1);

        System.out.println("-----------------------------------------------------------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>();

        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);

        ArrayList<String> namesList2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList2);

        System.out.println("-----------------------------------------------------------------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> nums1 = ArraysUtility.convertArrayToArrayList(arr);
        System.out.println(nums1);

    }

}
