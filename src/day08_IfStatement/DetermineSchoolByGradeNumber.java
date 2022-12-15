package day08_IfStatement;

public class DetermineSchoolByGradeNumber {

    public static void main(String[] args) {

        byte gradeNumber = 8; // 1 ~ 18

        boolean elementarySchool = gradeNumber >= 1 && gradeNumber <= 5;
        boolean middleSchool = gradeNumber >= 6 && gradeNumber <= 8;
        boolean highSchool = gradeNumber >= 9 && gradeNumber <= 12;
        boolean college = gradeNumber >= 13 && gradeNumber <= 16;
        boolean gradSchool = gradeNumber >= 17 && gradeNumber <= 18;

        if (elementarySchool){
            System.out.println("Elementary School");
        } else if (middleSchool) {
            System.out.println("Middle School");
        } else if (highSchool) {
            System.out.println("High School");
        } else if (college) {
            System.out.println("College");
        }else {
            System.out.println("Grade School");
        }

    }

}

/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
        grade level and types are:
            1-5: Elementary school
            6-8: Middle school
            9-12: High school
            13-16: College
            17-18: Grad School
         Assume that the given number is 1 ~ 18
 */