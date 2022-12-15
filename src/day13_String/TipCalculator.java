package day13_String;

import java.util.Scanner;

public class TipCalculator {

    /*
    Create a class called TipCalculator, write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

    Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should display the following information based on the user input:
    Split or No split (Yes or No),  Number of people entered: (number)(each person = & in output)
    Check amount: (number) Service Quality:(String)
    Total to pay: Total tip: Total per person: Tip per person:
            Ex:
                Split or No split (Yes or No)?
                Yes
            Enter the number of people
                4
            Enter the check amount:
                476
            How was the srvice quality?(Excellent/Great/Good/Fair/Poor)
                Excellent

                            output:
                        Number of people entered: 4
                        Total to pay: 595.0
                        Total tip: 119.0
                        Total per person: 148.75
                        Tip per person: 29.75

                        HINT: you will need to use .equals() method
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No Split ( Yes or No)?");
        String splitOrNot = scan.next();

        System.out.println("Enter the number of people:");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("How whas the service quality?(Excellent/Great/Good/Fair/Poor");
        String serviceQuality = scan.next();

        double totalTip = 0;
        if (serviceQuality.equals("Excellent")){
            totalTip = checkAmount * 25 / 100;
        }
        if (serviceQuality.equals("Great")){
            totalTip = checkAmount * 20 / 100;
        }
        if (serviceQuality.equals("Good")){
            totalTip = checkAmount * 15 / 100;
        }
        if (serviceQuality.equals("Fair")){
            totalTip = checkAmount * 10 / 100;
        }
        if (serviceQuality.equals("Poor")){
            totalTip = checkAmount * 5 / 100;
        }

        double totalPay = totalTip + checkAmount;
        double totalPerPerson = totalPay / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);

        scan.close();


    }
}
