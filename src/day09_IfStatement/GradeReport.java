package day09_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 41; // 0 ~ 100
        String grade;

        boolean gradesA = score >= 80 && score <= 100;
        boolean gradesB = score >= 60 && score < 80;
        boolean gradesC = score >= 40 && score < 60;
        boolean gradesD = score >= 20 && score < 40;
        boolean gradesF = score >= 0  && score < 20;

        if (gradesA){
            grade = "A";
        } else if (gradesB) {
            grade = "B";
        } else if (gradesC) {
            grade = "C";
        } else if (gradesD) {
            grade = "D";
        }else {
            grade = "F";
        }

        System.out.println("Grade = " + grade);

    }

}
