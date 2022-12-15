package day09_IfStatement;

public class PassOrFail {

    public static void main(String[] args) {

        int score = 59;

        boolean pass = score >= 60;

        if (pass){
            System.out.println("Congrate, you passed.");
        }else {
            System.out.println("Failed");
        }

    }

}
