package day17_While_DoWhile;

import java.util.Scanner;

public class Task6 {

    /*
    Create a class called InsuranceQuote, write a program that can calculate the insurance cost of
    a person based on the following info:

1. Ask the user to enter your name

2. Ask the user to enter your gender (if user enters invalid entry, ask the user
   to re-enter until user provides a valid entry)

3. Ask the user if he/she is married(Yes/No) (if user enters invalid entry,
   ask the user to re-enter until user provides a valid entry)

4. Ask user to enter your age(age can not be negative or greater than 120) (if user enters invalid entry,
   ask the user to re-enter until user provides a valid entry)

5. Ask user to enter how many miles he/she drives in a day (mileage can not be negative or less than 5) (if user
   enters invalid entry, ask the user to re-enter until user provides a valid entry)

6. Ask the user if he/she wants full coverage or liability insurance?

7. Ask if he/she had any accidents or claims in past 5 years (Yes/No) (if user enters invalid entry, ask the
   user to re-enter until user provides a valid entry)

8. Ask the user if his/her car has an anti-theft device (Yes/No) (if user enters invalid entry, ask the user to
   re-enter until user provides a valid entry)

   Calculate the price of the insurance and display all the info of the user
Insurance Quote calculation:
    starting prices for liability:
        age < 25 ===> 90
        age >= 25 ==> 50
        miles <= 10 ====> $10
        miles > 10 and miles <= 50 ==> $30
        miles > 50 ===>  $50

    starting prices for full coverage:
        age < 25 ===> 160
        age >= 25 ==> 120
        miles <= 10 ====> $20
        miles > 10 and miles <= 50 ==> $40
        miles > 50 ===>  $70
    If the car has anti-theft device ==> 5% discount
    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
    If he/she never had any accidents or claims in past 5 years ==> 10% discount
    If he/she is married ==> 5% discount
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalPrice = 0;

        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println("Enter your gender(male / female)");
        String gender = scan.next();
        while (!(gender.equals("male") || gender.equals("female"))){
            System.err.println("Invalid gender, please re-enter");
            System.out.println("Enter your gender(male / female)");
            gender = scan.next();
        }

        System.out.println("Are you married? (Yes / No)");
        String married = scan.next();
        while (!(married.equals("Yes") || married.equals("No"))){
            System.err.println("Invalid answer, please re-enter");
            System.out.println("Are you married? (Yes / No)");
            married = scan.next();
        }

        System.out.println("How old are you?(Can not be negative or greater than 120)");
        int age = scan.nextInt();
        while (!(age > 0 || age < 120)){
            System.err.println("Invalid age, please re-enter");
            System.out.println("How old are you?(Can not be negative or greater than 120)");
            age = scan.nextInt();
        }

        System.out.println("How many miles you drives in a day? (mileage can not be negative or less than 5)");
        int milesage = scan.nextInt();
        while (!(milesage > 5)){
            System.err.println("Invalid mileage, please re-enter");
            System.out.println("How many miles you drives in a day? (mileage can not be negative or less than 5)");
            milesage = scan.nextInt();
        }

        System.out.println("Do you want coverage or liability insurance?");
        String insurance = scan.next();
        while (!(insurance.equals("coverage") || insurance.equals("liability"))){
            System.err.println("invalid answer, please re-enter");
            System.out.println("Do you want coverage or liability insurance?");
            insurance = scan.next();
        }

        System.out.println("Do you had any accidents or claims in past 5 years? (Yes / No)");
        String accident = scan.next();
        while (!(accident.equals("Yes") || accident.equals("No"))){
            System.err.println("Invalid answer, please re-enter");
            System.out.println("Do you had any accidents or claims in past 5 years? (Yes / No)");
            accident = scan.next();
        }

        System.out.println("Your car has any anti-theft device?(Yes / No)");
        String antiTheftDevice = scan.next();
        while (!(antiTheftDevice.equals("Yes") || antiTheftDevice.equals("No"))){
            System.err.println("Invalid answer, please re-enter");
            System.out.println("Your car has any anti-theft device?(Yes / No)");
            antiTheftDevice = scan.next();
        }

        if (insurance.equals("liability")){
            if (age < 25){
                totalPrice += 90;
            }else {
                totalPrice += 50;
            }

            if (milesage <= 10){
                totalPrice += 10;
            } else if (milesage > 10 && milesage <= 50){
                totalPrice += 30;
            }else {
                totalPrice += 50;
            }
        }else {
            if (age < 25){
                totalPrice += 160;
            }else{
                totalPrice += 120;
            }

            if (milesage <= 10){
                totalPrice += 20;
            } else if (milesage > 10 && milesage <= 50) {
                totalPrice += 40;
            }else {
                totalPrice += 70;
            }
        }

        if (antiTheftDevice.equals("Yes")){
            totalPrice *= 0.95;
        }

        if (accident.equals("Yes")){
            totalPrice *= 1.15;
        }else {
            totalPrice *= 0.9;
        }

        if (married.equals("Yes")){
            totalPrice *= 0.95;
        }

        System.out.println("TotalPrice = " + totalPrice +"$");

        scan.close();

    }

}
