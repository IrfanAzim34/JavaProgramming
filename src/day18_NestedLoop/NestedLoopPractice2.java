package day18_NestedLoop;

public class NestedLoopPractice2 {

    /*
    Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
     */

    public static void main(String[] args) {

        String str = "* ";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(str);

            }
            System.out.println();
        }

    }

}
