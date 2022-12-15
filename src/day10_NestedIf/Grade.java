package day10_NestedIf;

public class Grade {

    /*
    Create a class called Grade, a char variable named grade is given.
    write a program to print the following messages:

                'A': excellent
                'B': great job
                'C': good
                'D': passed
                'F': failed
                other wise: invalid

    NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */

    public static void main(String[] args) {

        char grade = 'F';
        String message;

        /*
        String result = ('A' <= grade && grade <= 'F')? (grade == 'A')?"'A': Excellent"
                :(grade == 'B')?"'B': Great Job" :(grade == 'C')?"'C': Good"
                :(grade == 'D')?"'D': Passed" :"'F': Failed" :"Invalid";
        */

        if ('A' <= grade && grade <= 'F'){
            if (grade == 'A'){
                message = "'A': Excellent";
            } else if (grade == 'B') {
                message = "'B': Great Job";
            } else if (grade == 'C') {
                message = "'C': Good";
            } else if (grade == 'D') {
                message = "'D': Passed";
            }else {
                message = "'F': Failed";
            }
        }else {
            message = "Invalid";
        }

        System.out.println(message);

    }

}
