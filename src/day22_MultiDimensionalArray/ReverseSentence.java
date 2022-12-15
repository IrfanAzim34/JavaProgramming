package day22_MultiDimensionalArray;

public class ReverseSentence {

    /*
    Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
     */

    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String[] arr = sentence.split(" ");

        String reverseSentence = "";

        for (int i = arr.length-1; i >= 0; i--) {
            reverseSentence += arr[i] + " ";
        }

        System.out.println(reverseSentence.trim());
    }

}
