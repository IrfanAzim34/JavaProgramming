package day24_CustomMethods_Retun;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        String grade = grade(95);

        if (grade.equals("A")){
            System.out.println("Excellent");
        } else if (grade.equals("B")) {
            System.out.println("Great");
        } else if (grade.equals("C")) {
            System.out.println("Good");
        } else if (grade.equals("D")){
            System.out.println("Passed");
        }else {
            System.out.println("Try Again");
        }


    }

    public static String grade(int score){

        String result = "";

        if (score < 0 || score > 100){
            result = "Invalid";
        }

        result = (score >= 90)?"A" :(score >= 80)?"B" :(score >= 70)?"C" :(score >= 60)?"D" :"F";


        return result;


    }

}
