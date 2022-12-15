package day22_MultiDimensionalArray;

public class ReverseSecondWord {

    /*
    Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
     */

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] arr = sentence.split(" ");
        String reverseSecondWord = "";

        for (int i = 0; i < arr.length; i++) {
            String index1 = "";

            if (i == 1){
                for (int j = arr[i].length()-1; j >= 0; j--) {
                    index1 += arr[i].charAt(j);
                }

                arr[i] = index1;
            }

            reverseSecondWord += arr[i] + " ";

        }

        System.out.println(reverseSecondWord.trim());

    }

}
