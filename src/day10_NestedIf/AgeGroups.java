package day10_NestedIf;

public class AgeGroups {

    /*
    Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                            Teenager (< 21)
                            Adult   (>=21 && <55 )
                            Senior  ( >= 55 )
                            if age is negative or greater than 150, print invalid

    NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */

    public static void main(String[] args) {

        int age = 156;
        String message;

        /*
        String result = (age > 0 && age <= 150)? (age < 21)?"Teeneger" :(21 <= age && age < 55)?"Adult"
                :"Senior" :"Invalid";
        */

        if (age > 0 && age <= 150){
            if (age < 21){
                message = "Teeneger";
            } else if (21 <= age && age < 55) {
                message = "Adult";
            }else {
                message = "Senior";
            }
        }else {
            message = " Invalid";
        }

        System.out.println(message);

    }

}
