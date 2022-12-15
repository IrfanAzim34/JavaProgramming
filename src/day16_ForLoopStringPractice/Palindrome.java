package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Leve";

        String reversed = "";

        for (int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        if (word.toLowerCase().equalsIgnoreCase(reversed)){
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("It is a normal word");
        }

    }

}
