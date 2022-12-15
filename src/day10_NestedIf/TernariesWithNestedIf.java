package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

         int score = 190;

         String result = (0 <= score && score <= 100)? (score >= 60)?"Passed" :"Failed" :"Invalid score";
        System.out.println(result);

    }

}
