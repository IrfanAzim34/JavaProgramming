package day24_CustomMethods_Retun;

import java.util.Arrays;

public class Task6 {

    /*
    create a method named addElement that takes one integer array and one integer, the method can add
    the Integer number after the  last index of the integer array and returns the new array

                            Ex:
                                arr ={1,2,3};
                                num = 4;
                                addElement(arr, num) ==> {1,2,3,4}
     */

    public static void main(String[] args) {

        int[] arr ={1,2,3};
        int num = 4;

        int[] array = addElement(arr,num);

        System.out.println(Arrays.toString(array));

    }

    public static int[] addElement(int[] array, int number){

        int[] temp = new int[array.length+1];

        for (int i = 0; i < temp.length; i++) {
            if (i != temp.length-1){
                temp[i] = array[i];
            }else {
                temp[i] = number;
            }
        }

        return temp;

    }

}
