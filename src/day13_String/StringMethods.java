package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "CYDEO";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        System.out.println("-----------------------------------------------------------------------------------------");

        String s1 = "Batch 25 is the best batch";

        int totalNumberOfCharacter = s1.length();
        System.out.println("totalNumberOfCharacter = " + totalNumberOfCharacter);

        char lastChar = s1.charAt(25);
        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------------------------------------------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); // "WOODEN SPOON"

        System.out.println(str);


        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println(s);

        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);

    }

}
