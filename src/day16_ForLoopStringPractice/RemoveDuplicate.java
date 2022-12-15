package day16_ForLoopStringPractice;

public class RemoveDuplicate {

    /*
     Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
			Condition: the character is not contained in the other String yet before you are adding
     */

    public static void main(String[] args) {

        String word = "AABBCCBC";
        String removed = "";

        for (int i = 0; i < word.length(); i++) {
            if (!removed.contains(""+word.charAt(i))) {
                removed += word.charAt(i);
            }
        }

        System.out.println(removed);

    }
}
