package day24_CustomMethods_Retun;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Anna";
        String reverse = reverse(str);

        System.out.println(reverse);

        if (str.equalsIgnoreCase(reverse)) {
            System.out.println(str + " is palindrome");
        }else {
            System.out.println(str + " is not palindrome");
        }

    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i)+"";
        }

        return result;

    }

}
