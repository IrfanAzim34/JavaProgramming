package day24_CustomMethods_Return;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] arr = {1,5,7,2,7,4,9,3,5,7,2,34,23,34};

        int maxNumber = maxNumber(arr);

        System.out.println(maxNumber);

    }

    public static int maxNumber(int[] arr){

        int maxNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }

        return maxNumber;

    }



}
