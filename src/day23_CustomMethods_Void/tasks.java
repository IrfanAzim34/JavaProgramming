package day23_CustomMethods_Void;

public class tasks {

    public static void main(String[] args) {
        printOdds1To100();
        System.out.println();
        printEvens1To100();
        System.out.println();
        checkEligibleBuyAlcohol(29);
        checkEligibleVote(29,"usa");
        calculateTheGrade(86);
        areaOfCircle(1);
        areaOfSquare(2);
        dollarToEuro(100);
        dollarToLira(100.50);
        kgTolb(21.4);
        positiveNegativeZero(0);
        System.out.println();
        calculator(2,3,"*");
        System.out.println(regularFormatFullName("irfan aZim musa"));;
        anagram("silent","listen");
    }

    public static void printOdds1To100(){
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void printEvens1To100(){
        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }

    public static void checkEligibleBuyAlcohol(int age){
        if (age >= 18){
            System.out.println("The person can buy alcohol");
        }else {
            System.err.println("The person cannot buy alcohol");
        }
    }

    public static void checkEligibleVote(int age, String country){
        if (age >= 20 && country.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote!");
        }else {
            System.err.println("You are not eligible to vote!");
        }
    }

    public static void calculateTheGrade(int score){
        if (90 <= score && score <= 100){
            System.out.println("Your grade is: A");
        } else if (80 <= score && score < 90) {
            System.out.println("Your grade is: B");
        } else if (60 <= score && score < 80) {
            System.out.println("Your grade is: C");
        }else {
            System.out.println("Your grade is: D");
        }
    }

    public static void areaOfCircle(double radius){
        double pi = 3.14;
        System.out.println("Area of Circle is: " + (pi * radius * radius));
    }

    public static void areaOfSquare(double side){

        System.out.println("Area of Square is: " + (side * side));
    }

    public static void dollarToEuro(double dollar){
        double $1Dollar = 1.01;
        System.out.println(dollar + "$ = " + (dollar*$1Dollar) + " Euro");
    }

    public static void dollarToLira(double dollar){

        double $1dollar = 18.5;
        System.out.println(dollar + "$ = " + (dollar*$1dollar) + " Turkish Lira");

    }

    public static void kgTolb(double kg){

        double oneKg = 2.20;
        System.out.println(kg + " kg = " + (kg*oneKg) + " lb");

    }

    public static void positiveNegativeZero(double number){

        if (number > 0){
            System.out.println(number + " is positive numebr");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        }else {
            System.out.println(number + " is zero");
        }

    }

    public static void calculator(double num1, double num2, String operator){

        double result = 0;

        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    result = num1 / num2;
                    break;
            }
            System.out.println(result);
        }else {
            System.err.println("Invalid");
        }
    }

    public static String regularFormatFullName(String fullName){

        String result = "";

        String[] temp = fullName.split(" ");

        for (String word : temp) {
            String firstIndex = "";
            String otherIndexs = "";
            for (int i = 0; i < word.length(); i++) {
                if (i == 0){
                    firstIndex += word.charAt(i);
                    firstIndex = firstIndex.toUpperCase();
                    continue;
                }

                otherIndexs += word.charAt(i);
                otherIndexs = otherIndexs.toLowerCase();
            }

            result += firstIndex + otherIndexs + " ";
        }

        result = result.trim();

        return result;

    }

    public static void anagram(String str1, String str2){

        String str3 = str2;
        for (int i = 0; i < str1.length(); i++) {
            String ch = "" + str1.charAt(i);
            if(str2.contains(ch)){
                str2 = str2.replaceFirst(ch,"");
            }

        }

        boolean anagram = str2.isEmpty();

        if (anagram) {
            System.out.println(str1 + " and " + str3 + " are anagram");
        }else {
            System.out.println(str1 + " and " + str3 + " are not anagram");
        }

    }

}
