package day10_NestedIf;

public class GradeLevel {

    /*
    Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                1-5: Elementary school
                6-8: Middle school
                9-12: High school
                13-16: College
                17-18: Grad School
                For Any Other grade: Invalid grade level given
    NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */

    public static void main(String[] args) {

        byte number = 21;
        String message;

        /*
        String result = (1 <= number && number <= 18)? (1 <= number && number <= 5)?"Elementary School"
                :(6 <= number && number <= 8)?"Middle School" :(9 <= number && number <= 12)?"High School"
                :(13 <= number && number <= 16)?"College" :"Grade School" :"Invalid Grade Level Given";
        */

        if (1 <= number && number <= 18){
            if (1 <= number && number <= 5){
                message = "Elementary School";
            } else if (6 <= number && number <= 8) {
                message = "Middle School";
            } else if (9 <= number && number <= 12) {
                message = "High School";
            } else if (13 <= number && number <= 16) {
                message = "College";
            }else {
                message = "Grade School";
            }
        }else {
            message = "Invalid Grade Level";
        }

        System.out.println(message);


    }

}
