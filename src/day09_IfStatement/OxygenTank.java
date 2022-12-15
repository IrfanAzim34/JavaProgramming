package day09_IfStatement;

public class OxygenTank {


    public static void main(String[] args) {

        int level = 45;

        if (level > 90 && level <= 100){
            System.out.println("Your tank is full");
        } else if (level > 80 && level <= 90) {
            System.out.println("Still Okay");
        } else if (level > 70 && level <= 80) {
            System.out.println("Don't go too far");
        } else if (level > 60 && level <= 70) {
            System.out.println("Start to head back");
        } else if (level >50 && level <= 60) {
            System.out.println("Be careful now you at at 50%");
        }else {
            System.out.println("LOW OXYGEN LEVEL!");
        }

    }

}

/*
Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you
must print a message based on the level:
                                           Above 90 -  Your tank is full
                                           Above 80 -  Still okay
                                           Above 70 -  Don't go too far
                                           Above 60 -  Start to head back
                                           Above 50 -  Be careful now you at at 50%

USE ONE PRINT STATEMENT ONLY
 */