package day09_IfStatement;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        String name = "David";
        int age = 12;

        boolean eligibleToBuAlcohol = age >= 18;

        if (eligibleToBuAlcohol){
            System.out.println(name + " can buy alcohol.");
        }else {
            System.out.println(name + " can not buy alcohol.");
        }

    }

}
