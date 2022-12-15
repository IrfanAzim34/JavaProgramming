package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        for (char i = 65; i <= 90; ++i){
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 97; i <= 122; ++i){
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'Z'; i >= 'A'; --i){
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'z'; i >= 'a'; --i){
            System.out.print(i + " ");
        }

    }
}
