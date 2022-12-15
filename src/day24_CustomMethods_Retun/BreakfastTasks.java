package day24_CustomMethods_Retun;

import java.util.Scanner;

public class BreakfastTasks {

    /*
    1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
     */

    public static void main(String[] args) {

        initialsOfPerson("Irfan Azim");
        domainOfEmail("irfanteipov@gmail.com");
        nameOfTheMonth(12);
        nameOfTheDays(5);
        daysOfMonth(12);

    }

    public static void initialsOfPerson(String name){

        String[] names = name.split(" ");
        String initials = "";

        for (String each : names) {
            initials += each.charAt(0) + ",";
        }


        initials = initials.substring(0,initials.length()-1).toUpperCase();

        System.out.println(initials);

    }

    public static void domainOfEmail(String emailAddress){
        System.out.println(emailAddress.substring(emailAddress.indexOf("@")+1,emailAddress.indexOf(".")));
    }

    public static void nameOfTheMonth(int number){

        Scanner scan = new Scanner(System.in);

        while(!(1 <= number && number <= 12)){
            System.err.println("Invalid number, please re-enter");
            number = scan.nextInt();
        }
        String result = "";
        switch (number){
            case 1:
                result = "January";
                break;

            case 2:
                result = "February";
                break;

            case 3:
                result = "March";
                break;

            case 4:
                result = "April";
                break;

            case 5:
                result = "May";
                break;

            case 6:
                result = "June";
                break;

            case 7:
                result = "July";
                break;

            case 8:
                result = "August";
                break;

            case 9:
                result = "September";
                break;

            case 10:
                result = "October";
                break;

            case 11:
                result = "November";
                break;

            default:
                result = "December";
        }

        System.out.println(result);
    }

    public static void nameOfTheDays(int number){

        Scanner scan = new Scanner(System.in);

        while (!(1 <= number && number <= 7)){
            System.err.println("Invalid number, please re-enter");
            number = scan.nextInt();
        }

        switch (number){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");
        }

    }

    public static void daysOfMonth(int number){

        int days = 0;

        if (1 <= number && number <= 12){
            days = (number == 1)?31 :(number == 2)?28 :(number == 3)?31 :(number == 4)?30 :(number == 5)?31
                    :(number == 6)?30 :(number == 7)?31 :(number == 8)?30 :(number == 9)?31 :(number == 10)?30
                    :(number == 11)?31 :30;
            System.out.println(days);
        }else {
            System.err.println("Invalid");
        }

    }

}
