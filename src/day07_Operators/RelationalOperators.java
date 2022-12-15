package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 200 > 40;
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;
        System.out.println("result2 = " + result2);

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore <= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("-----------------------------------------------------------------------------------------");

        // Equal Operator
        int x = 100;
        int y = 200;

        boolean equal = x == y;
        System.out.println("equal = " + equal);

        boolean result3 = "Muhtar" == "Muhtar";
        System.out.println("result3 = " + result3);

        System.out.println("-----------------------------------------------------------------------------------------");

        // Not-Equal Operator
        int num1 = 140;
        int num2 = 200;
        boolean result4 = num1 != num2;
        System.out.println("result4 = " + result4);

    }

}
