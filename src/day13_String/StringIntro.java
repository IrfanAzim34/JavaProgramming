package day13_String;

public class StringIntro {

    public static void main(String[] args) {

        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2);

        System.out.println("-----------------------------------------------------------------------------------------");

        String s1 = "java";
        String s2 = new String("java");

        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4));

    }

}
