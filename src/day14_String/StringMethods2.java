package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";

        String str1 =  str.replace("Java", "Python");

        System.out.println(str);
        System.out.println(str1);

        String str2 = "JohnSmith@yahoo.com";
        str2 = str2.replace("yahoo", "gmail");
        System.out.println(str2);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python";
        sentence = sentence.replace(" Python", "");
        System.out.println(sentence);

        String s = "dog dog dog dog dog dog dog";
        s = s.replace("dog", "cat");
        System.out.println(s);

        String s1 = "java";
        s1 = s1.replace("av","ev");
        System.out.println(s1);

        System.out.println("-----------------------------------------------------------------------------------------");

        String s2 = "Java Java Java Java";
        s2 = s2.replaceFirst("Java","Python");
        System.out.println(s2);

        String s3 = "C# is fun, C# is cool";
        s3 = s3.replaceFirst("C#","Java");
        System.out.println(s3);

        String s4 = "Java";
        s4 = s4.replaceFirst("a","e");
        System.out.println(s4);



    }

}
