package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    // Print each element of array in separate lines
    public static void printEachElement(int[] array){

        for (int each : array) {
            System.out.println(each);
        }

    }
    public static void printEachElement(double[] array){

        for (double each : array) {
            System.out.println(each);
        }

    }
    public static void printEachElement(String[] array){

        for (String each : array) {
            System.out.println(each);
        }

    }
    public static void printEachElement(char[] array){

        for (char each : array) {
            System.out.println(each);
        }

    }



    // Returns the maximum number of array
    public static int maxNumberOfArray(int[] array){

        Arrays.sort(array);

        int max = array[array.length-1];

        return max;

    }
    public static double maxNumberOfArray(double[] array){

        Arrays.sort(array);

        double max = array[array.length-1];

        return max;

    }
    public static long maxNumberOfArray(long[] array){

        Arrays.sort(array);

        long max = array[array.length-1];

        return max;

    }
    public static short maxNumberOfArray(short[] array){

        Arrays.sort(array);

        short max = array[array.length-1];

        return max;

    }
    public static float maxNumberOfArray(float[] array){

        Arrays.sort(array);

        float max = array[array.length-1];

        return max;

    }
    public static byte maxNumberOfArray(byte[] array){

        Arrays.sort(array);

        byte max = array[array.length-1];

        return max;

    }



    // Returns the minimum number of array
    public static int minNumberOfArray(int[] array){

        Arrays.sort(array);

        int min = array[0];

        return min;

    }
    public static double minNumberOfArray(double[] array){

        Arrays.sort(array);

        double min = array[0];

        return min;

    }
    public static long minNumberOfArray(long[] array){

        Arrays.sort(array);

        long min = array[0];

        return min;

    }
    public static short minNumberOfArray(short[] array){

        Arrays.sort(array);

        short min = array[0];

        return min;

    }
    public static float minNumberOfArray(float[] array){

        Arrays.sort(array);

        float min = array[0];

        return min;

    }
    public static byte minNumberOfArray(byte[] array){

        Arrays.sort(array);

        byte min = array[0];

        return min;

    }



    // Check if the given element is contained in the given array, returns boolean
    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each : array) {
            if (each == element){
                result = true;
            }
        }

        return result;

    }
    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each : array) {
            if (each == element){
                result = true;
            }
        }

        return result;

    }
    public static boolean contains(String[] array, String str){

        boolean result = false;

        for (String each : array) {
            if (each.equals(str)){
                result = true;
            }
        }

        return result;

    }
    public static boolean contains(char[] array, char ch){

        boolean result = false;

        for (char each : array) {
            if (each == ch){
                result = true;
            }
        }

        return result;

    }



    // This method can merge two arrays
    public static int[] merge2Arrays(int[] arr1, int[] arr2){

        int[] arr = new int[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[index++] = arr2[i];
        }

        return arr;

    }
    public static double[] merge2Arrays(double[] arr1, double[] arr2){

        double[] arr = new double[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[index++] = arr2[i];
        }

        return arr;

    }
    public static char[] merge2Arrays(char[] arr1, char[] arr2){

        char[] arr = new char[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[index++] = arr2[i];
        }

        return arr;

    }
    public static String[] merge2Arrays(String[] arr1, String[] arr2){

        String[] arr = new String[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[index++] = arr2[i];
        }

        return arr;

    }



    // This method can reverse an array
    public static int[] reverseArray(int[] array){

        int[] reversed = new int[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }

        return reversed;

    }
    public static double[] reverseArray(double[] array){

        double[] reversed = new double[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }

        return reversed;

    }
    public static char[] reverseArray(char[] array){

        char[] reversed = new char[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }

        return reversed;

    }
    public static String[] reverseArray(String[] array){

        String[] reversed = new String[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }

        return reversed;

    }



    // Add the given element to array, returns a new array
    public static int[] addElement(int[] array, int newElement){
        int[] result = new int[array.length+1];

        int index = 0;

        for (int each : array) {
            result[index++] = each;
        }

        result[index] = newElement;

        return result;
    }
    public static double[] addElement(double[] array, double newElement){

        double[] result = new double[array.length+1];

        int index = 0;

        for (double each : array) {
            result[index++] = each;
        }

        result[index] = newElement;

        return result;

    }
    public static char[] addElement(char[] array, char newElement){

        char[] result = new char[array.length+1];

        int index = 0;

        for (char each : array) {
            result[index++] = each;
        }

        result[index] = newElement;

        return result;

    }
    public static String[] addElement(String[] array, String newElement){

        String[] result = new String[array.length+1];

        int index = 0;

        for (String each : array) {
            result[index++] = each;
        }

        result[index] = newElement;

        return result;

    }



    // This method returns the frequency of the given element from the array
    public static int frequencyOfElement(int[] array, int element){

        int count = 0;

        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;

    }
    public static int frequencyOfElement(double[] array, double element){

        int count = 0;

        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;

    }
    public static int frequencyOfElement(char[] array, char element){

        int count = 0;

        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;

    }
    public static int frequencyOfElement(String[] array, String element){

        int count = 0;

        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }

        return count;

    }



    // Check the unique elements in the given array, and return an array that included unique elements
    public static int[] uniqueElements(int[] array){

        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;

    }
    public static double[] uniqueElements(double[] array){

        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;

    }
    public static char[] uniqueElements(char[] array){

        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;

    }
    public static String[] uniqueElements(String[] array){

        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;

    }



    // This method removes the element at the given index of the array and returns the a new array
    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }

            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;

    }
    public static double[] removeElement(double[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }

            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;

    }
    public static char[] removeElement(char[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }

            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;

    }
    public static String[] removeElement(String[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }

            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;

    }



    // This method replaces the element of the array at given index with the new element, and returns the new array.
    public static int[] replaceElement(int[] array, int index, int newElement){

        if (0 > index || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }
    public static double[] replaceElement(double[] array, int index, double newElement){

        if (0 > index || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }
    public static char[] replaceElement(char[] array, int index, char newElement){

        if (0 > index || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }
    public static String[] replaceElement(String[] array, int index, String newElement){

        if (0 > index || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }



    // This method replaces all the element of the array that matching with the given old element with the given
    // new element, and returns the new array.
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }

        return array;

    }
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }

        return array;

    }
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }

        return array;

    }
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }

        return array;

    }



    // This method can remove the duplicated elements from the given array, and return a new array
    public static int[] removeDuplicated(int[] array){

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;

    }
    public static double[] removeDuplicated(double[] array){

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;

    }
    public static char[] removeDuplicated(char[] array){

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;

    }
    public static String[] removeDuplicated(String[] array){

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;

    }



    // This method inserts the given element to the given index of the array and returns the new array
    public static int[] insertToArray(int[] array, int index, int newElement){

        if (0 > index || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                result = ArraysUtility.addElement(result,newElement);
            }

            result = ArraysUtility.addElement(result,array[i]);

        }

        return result;

    }
    public static double[] insertToArray(double[] array, int index, double newElement){

        if (0 > index || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                result = ArraysUtility.addElement(result,newElement);
            }

            result = ArraysUtility.addElement(result,array[i]);

        }

        return result;

    }
    public static char[] insertToArray(char[] array, int index, char newElement){

        if (0 > index || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                result = ArraysUtility.addElement(result,newElement);
            }

            result = ArraysUtility.addElement(result,array[i]);

        }

        return result;

    }
    public static String[] insertToArray(String[] array, int index, String newElement){

        if (0 > index || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                result = ArraysUtility.addElement(result,newElement);
            }

            result = ArraysUtility.addElement(result,array[i]);

        }

        return result;

    }



    // This method swaps the element at index i with the element at index j, and returns the new array
    public static int[] swapElements(int[] array, int indexI, int indexJ){

        if ((0 > indexI || indexI > array.length-1) || (0 > indexJ || indexJ > array.length-1)){
            System.err.println("Invaid Index");
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == indexI){
                result = ArraysUtility.addElement(result,array[indexJ]);
                continue;
            }
            if (i == indexJ){
                result = ArraysUtility.addElement(result,array[indexI]);
                continue;
            }

            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;


    }
    public static double[] swapElements(double[] array, int indexI, int indexJ){

        if ((0 > indexI || indexI > array.length-1) || (0 > indexJ || indexJ > array.length-1)){
            System.err.println("Invaid Index");
            System.exit(0);
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == indexI){
                result = ArraysUtility.addElement(result,array[indexJ]);
                continue;
            }
            if (i == indexJ){
                result = ArraysUtility.addElement(result,array[indexI]);
                continue;
            }

            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;


    }
    public static char[] swapElements(char[] array, int indexI, int indexJ){

        if ((0 > indexI || indexI > array.length-1) || (0 > indexJ || indexJ > array.length-1)){
            System.err.println("Invaid Index");
            System.exit(0);
        }

        char[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == indexI){
                result = ArraysUtility.addElement(result,array[indexJ]);
                continue;
            }
            if (i == indexJ){
                result = ArraysUtility.addElement(result,array[indexI]);
                continue;
            }

            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;


    }
    public static String[] swapElements(String[] array, int indexI, int indexJ){

        if ((0 > indexI || indexI > array.length-1) || (0 > indexJ || indexJ > array.length-1)){
            System.err.println("Invaid Index");
            System.exit(0);
        }

        String[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i == indexI){
                result = ArraysUtility.addElement(result,array[indexJ]);
                continue;
            }
            if (i == indexJ){
                result = ArraysUtility.addElement(result,array[indexI]);
                continue;
            }

            result = ArraysUtility.addElement(result,array[i]);
        }

        return result;


    }


    // This method can convert primitive Array to Arraylist
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        ArrayList<Integer> result = new ArrayList<>();

        for (int each : array) {
            result.add(each);
        }

        return result;

    }
    public static ArrayList<Double> convertArrayToArrayList(double[] array){

        ArrayList<Double> result = new ArrayList<>();

        for (double each : array) {
            result.add(each);
        }

        return result;

    }
    public static ArrayList<Character> convertArrayToArrayList(char[] array){

        ArrayList<Character> result = new ArrayList<>();

        for (char each : array) {
            result.add(each);
        }

        return result;

    }


}
