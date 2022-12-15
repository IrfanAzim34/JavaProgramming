package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 134;
        String result = "";

        if (0 <= score && score <= 100){
            if (score >= 90){
                result = "Excellent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            }else {
                result = "Failed";
            }
        }else {
            result = "Invalid Score";
        }

        System.out.println(result);

    }

}
