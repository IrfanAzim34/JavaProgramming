package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        /*
        System.out.println(true == !false); // true
        System.out.println(!true != false); // false
        System.out.println(!false == true); // true

        System.out.println(!!false); // false
        System.out.println(!!!true); // false
         */

        double score = 59.9;

        if (score>=90 && score<=100){
            System.out.println("Excellent");
        }

        if (score>=80 && score<=89){
            System.out.println("Great");
        }

        if (score>=70 && score<=79){
            System.out.println("Good");
        }

        if (score>=60 && score<=69){
            System.out.println("Passed");
        }

        if (score<60){
            System.out.println("Failed");
        }

    }

}
