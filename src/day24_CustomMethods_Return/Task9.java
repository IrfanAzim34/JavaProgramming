package day24_CustomMethods_Return;

public class Task9 {

    /*
    Create a method named contains that passes one integer array and one integer parameters, the method returns true
    if the given integer is contained in the given array, otherwise returns false

                            Ex:
                                arr = {1,2,3,4,5,6,7};
                                num = 10;
                                contains(arr, num) ===> false
     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int num = 10;

        boolean contains = contains(arr,num);

        System.out.println(contains);

    }

    public static boolean contains(int[] arr, int num){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }

        return false;

    }

}
