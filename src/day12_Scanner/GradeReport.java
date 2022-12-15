package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    /*
    GradeReport:
            1.1 Ask the user to enter the his/her score
            1.2 Print the grade of the student (A, B, C, D, F)
            1.3 If user enter invalid score (negative or more than 100) print invalid score
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int gradeScore = input.nextInt();
        String result = "";

        if ( 0 <= gradeScore && gradeScore <= 100 ){
            result = (gradeScore <= 20)?"F" :(gradeScore <= 40)?"D" :(gradeScore <= 60)?"C" :(gradeScore <= 80)?"B"
                    :"A";
        }else {
            result = "Invalid Score";
        }

        System.out.println(result);

        input.close();

    }
}
