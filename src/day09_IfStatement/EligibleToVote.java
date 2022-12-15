package day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "John",
                citizen = "USA";
        int age = 18;

        boolean eligibleToVote = age >= 18 && citizen == "USA";

        if (eligibleToVote){
            System.out.println(name + " can vote.");
        }else {
            System.out.println(name + " can not vote.");
        }

    }

}
