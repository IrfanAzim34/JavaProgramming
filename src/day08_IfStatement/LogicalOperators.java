package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-----------------------------------------------------------------------------------------");

        String name2 = "John";
        int creditScore = 720;
        int age2 = 20;

        boolean isEligible2 = creditScore >= 700 || age2 >= 21;
        System.out.println(name2 + " is eligible to vote: " + isEligible2);

        System.out.println("-----------------------------------------------------------------------------------------");

        boolean result = true;
        boolean result2 = !result;
        System.out.println("result2 = " + result2);

        System.out.println("-----------------------------------------------------------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }

}
