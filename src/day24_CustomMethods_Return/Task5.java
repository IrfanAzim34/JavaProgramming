package day24_CustomMethods_Return;

public class Task5 {

    /*
    create method that accepts one integer array and one integer number and returns the frequency of the number

                                Ex:
                                    int[] array ={1,1,1,1,1,2,2};
                                    frequency(array, 1) ==> 5
     */

    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};

        printElementFrequency(array,7);

    }

    public static void printElementFrequency(int[] array, int number){

        int frequency = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                frequency++;
            }
        }

        System.out.println(frequency);

    }

}
