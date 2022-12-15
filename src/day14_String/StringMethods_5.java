package day14_String;

public class StringMethods_5 {

    public static void main(String[] args) {

        String str = " ";

        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        System.out.println("-----------------------------------------------------------------------------------------");

        String str1 = "ABCDFH";
        String str2 = "abcdfh";

        Boolean ignoreCase = str1.equalsIgnoreCase(str2);
        System.out.println(ignoreCase);

        System.out.println("-----------------------------------------------------------------------------------------");

        String sentence = "My favorite programming language is Java";
        boolean result = sentence.contains("java");
        sentence.toLowerCase().contains("java");

        System.out.println(result);

        System.out.println("-----------------------------------------------------------------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("oo");
        System.out.println(x);

        boolean y = a.endsWith("oon");
        System.out.println(y);

        sentence.toLowerCase().contains(a);

    }

}
