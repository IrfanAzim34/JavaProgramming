package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isELigible = age >= 21 && citizen == "USA";

        if (isELigible){
            System.out.println("Eligible");
        }

        if (!isELigible){
            System.out.println("Not Eligible");
        }
    }

}
