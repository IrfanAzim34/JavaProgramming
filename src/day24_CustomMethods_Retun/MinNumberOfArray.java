package day24_CustomMethods_Retun;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] arr = {4,7,2,5,8,2,5,7,9,4,67,3,5,7};

        int minNumber = minNumber(arr);

        System.out.println(minNumber);

    }


    public static int minNumber(int[] arr){

        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber){
                minNumber = arr[i];
            }
        }

        return minNumber;

    }

}
