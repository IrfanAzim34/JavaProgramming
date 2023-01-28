package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = s -> {

            String reverse = new StringBuilder(s).reverse().toString();
            return s.equalsIgnoreCase(reverse);

        };

        System.out.println(isPalindrome.test("java"));

        Predicate<Integer> isEven = integer -> integer % 2 == 0;

        System.out.println("------------------------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,71,2,3,4,5,8,3,6,7));

        list.removeIf(isEven);

        System.out.println(list);

        System.out.println("--------------------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level","Anna","Java","Python"));

        names.removeIf(isPalindrome);

        System.out.println(names);

        System.out.println("-------------------------------------------------------------");

        Consumer<String> printEach = s -> {

            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }

        };

        printEach.accept("Wooden Spoon");

        System.out.println("---------------------------------------------------------------");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,52,23,41,42));

        list1.forEach(p -> {if (p % 2 == 0) System.out.println(p);});

        System.out.println("--------------------------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Irfan Azim","Ali Kara","Kayser Kuresh","Jilili Jiwuer"));

        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.indexOf(" ")+1)));

        System.out.println("-----------------------------------------------------------------");

        Function<int[],List<Integer>> convertToList = arr -> {

            List<Integer> result = new ArrayList<>();
            for (int each : arr) {
                result.add(each);
            }

            return result;

        };

        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        List<Integer> list2 = convertToList.apply(numbers);
        System.out.println(list2);

        System.out.println("---------------------------------------------------------------------");

        Function<List<Integer>,int[]> convertToArray = a -> {

            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }

            return result;

        };

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,4,66,7,3,5));
        System.out.println(list3);
        int[] array = convertToArray.apply(list3);
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------------------------------------------");

        // create a function that can return the maximum number from an int array
        Function<int[],Integer> returnMaxNum = arr -> {

            int maxNum = arr[0];

            for (int each : arr) {
                if (each > maxNum){
                    maxNum = each;
                }
            }

            return maxNum;

        };

        int[] arr = {1,2,4,123,5,8,4,2,5,68};
        int maxNumber = returnMaxNum.apply(arr);
        System.out.println(maxNumber);

        System.out.println("------------------------------------------------");

        // create a function that can swap the first and last elements of an array
        Function<int[],int[]> swapFirstAndLast = arr1 -> {

            int firstElement = arr1[0];
            arr1[0] = arr1[arr1.length-1];
            arr1[arr1.length-1] = firstElement;

            return arr1;

        };

        int[] arr1 = {1,2,4,123,5,8,4,2,5,68};
        System.out.println(Arrays.toString(arr1));
        arr1 = swapFirstAndLast.apply(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------------------------------------");

        // Create a function that can reverse an array and returns it
        Function<int[],int[]> reverseArray = arr3 -> {

            int[] result = new int[arr3.length];

            for (int i = arr3.length - 1; i >= 0; i--) {
                result[(arr3.length - 1)-i] = arr3[i];
            }

            return result;
        };

        int[] arr4 = {1,2,4,123,5,8,4,2,5,68};
        System.out.println(Arrays.toString(arr4));
        arr4 = reverseArray.apply(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("----------------------------------------------------------------");

        // create a function that can reverse a List
        Function<List<Integer>,List<Integer>> reverseList = l -> {

            List<Integer> result = new ArrayList<>();
            for (int i = l.size() - 1; i >= 0; i--) {
                result.add(l.get(i));
            }

            return result;

        };

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,4,66,7,3,5));
        System.out.println(list4);
        list4 = reverseList.apply(list4);
        System.out.println(list4);

    }

}
