package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {

    /*
    Given the following arraylists:
        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        Write a program that can count the total numbers of grade A, B, C, D and F
     */

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer score : scores) {
            if (90 <= score && score <=100) {
                gradeOfA.add(score);
            }else if (80 <= score && score <= 89) {
                gradeOfB.add(score);
            } else if (70 <= score && score <= 79) {
                gradeOfC.add(score);
            } else if (60 <= score && score <= 69) {
                gradeOfD.add(score);
            }else {
                gradeOfF.add(score);
            }
        }

        System.out.println("Total Number of A = " + gradeOfA.size());
        System.out.println("Total Number of B = " + gradeOfB.size());
        System.out.println("Total Number of C = " + gradeOfC.size());
        System.out.println("Total Number of D = " + gradeOfD.size());
        System.out.println("Total Number of F = " + gradeOfF.size());

    }

}
