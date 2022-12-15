package day24_CustomMethods_Return;

public class Task4 {

    /*
    By using the reverse method above to create another method named isPalindrome  that passes a String parameter,
    the method returns true if the string is palindrome, otherwise returns false

                            Ex:
                                str = "Level"
                                isPalindrome(str) ===> true
     */

    public static void main(String[] args) {

        String str = "Level";

        boolean isPalindrome = isPalindrome(str);

        System.out.println(isPalindrome);

    }

    public static boolean isPalindrome(String str){

        str = str.toLowerCase();
        String reverse = Task3.reverse(str);


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }

        return true;
    }

}
