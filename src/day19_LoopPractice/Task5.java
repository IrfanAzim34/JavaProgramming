package day19_LoopPractice;

import java.util.Scanner;

public class Task5 {

    /*
     Write a program for the salary calculator
        1. Ask the user "How much you make an hour?"If user entered hourlyRate is 0 or negative, terminate the program
        after displaying the error message "Invalid Entry for Hourly Rate"
        2. Ask the user  "How many hours do you work per week?"
        if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error
        message "Invalid Entry for Weekly Hours"
        3. Ask the user  "Enter your state tax rate"if the state tax rate is less than 0% or greater than 10%, terminate
        the program after displaying the error message "Invalid Entry for state tax Rate"
        4. Display:
            1. Gross Salary
            2. Federal Tax (assume that federal tax rate is 26%)
            3. State Tax
            4. Total Tax
            5. Net Income
        5. Ask the user "Would you like to continue?"
        If "yes" --> repeat all the previous steps
        If "no" --> print "Thank you for using Cydeo Salary Calculator APP"
        If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("How much you make an hour?");
            double hourlyRate = scan.nextDouble();

            while (hourlyRate <= 0){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            double weeklyHour = scan.nextDouble();

            while (!(1 < weeklyHour && weeklyHour < 144)){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double stateTaxRate = scan.nextDouble();

            while (!(0 < stateTaxRate && stateTaxRate < 10)){
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            double grossSalary = hourlyRate * weeklyHour * 52;
            double federalTax = grossSalary * 26 / 100;
            double stateTax = grossSalary * stateTaxRate / 100;
            double totalTax = federalTax + stateTax;
            double netIncome = grossSalary - totalTax;

            System.out.println("Gross Salary = " + grossSalary);
            System.out.println("Federal Tax = " + federalTax);
            System.out.println("State Tax = " + stateTax);
            System.out.println("Total Tax = " + totalTax);
            System.out.println("Net Income = " + netIncome);

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                System.exit(0);
            }


        }

    }

}
