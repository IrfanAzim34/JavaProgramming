package day09_IfStatement;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 7;

        boolean infant = age >= 1 && age <= 2;
        boolean toddler = age >= 3 && age <= 5;
        boolean kid = age >= 6 && age <= 9;
        boolean preTeen = age >= 10 && age <= 12;
        boolean teenager = age >= 13 && age <= 17;
        boolean youngAdult = age >= 18 && age <= 20;
        boolean adult = age >= 21 && age <= 39;
        boolean youngMiddleAgedAdult = age >= 40 && age <= 49;
        boolean middleAgedAdult = age >= 50 && age <= 54;
        boolean veryYoungSeniorCItizen = age >= 55 & age <= 64;
        boolean youngSeniorCitizen = age >= 65 && age <= 74;
        boolean seniorCitizen = age >= 75 && age <= 84;

        if (infant){
            System.out.println("Infant");
        } else if (toddler) {
            System.out.println("Toddler");
        } else if (kid) {
            System.out.println("Kid");
        } else if (preTeen) {
            System.out.println("Pre-Teen");
        } else if (teenager) {
            System.out.println("Teenager");
        } else if (youngAdult) {
            System.out.println("Young Adult");
        } else if (adult) {
            System.out.println("Adult");
        } else if (youngMiddleAgedAdult) {
            System.out.println("Young Middle-Aged Adult");
        } else if (middleAgedAdult) {
            System.out.println("Middle-Aged Adult");
        } else if (veryYoungSeniorCItizen) {
            System.out.println("Very YoungSenior Citizen");
        } else if (youngSeniorCitizen) {
            System.out.println("Young Senior Citizen");
        } else if (seniorCitizen) {
            System.out.println("Senior citizen");
        }else {
            System.out.println("Old Senior Citizen");
        }

    }

}

/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person
             age groups are:
                    infant (1 - 2)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */