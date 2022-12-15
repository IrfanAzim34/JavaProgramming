package day13_String;

import java.util.Scanner;

public class Travel {

    /*
    Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.

    Ask the user if they have a valid passport (yes or no)
    If the user enters yes:The base cost of the ticket should be set to: 1000

    Ask the user the country they to travel to (String, multiple word)

    Ask the user how many bags they will take with them (byte) > Each bag will add 50 to the cost

    Ask the user how many people they will travel with (short) > For each person the cost is reduced by 100. Up to a limit of 300.

    Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling
        with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"

If the user enters no: The base cost of the passport renewal is: 200

    Ask the user when their passport expired(int) > Each year it was expired adds 75 to the cost

    Ask the user which country they plan to travel

    Ask the user if they will be traveling in the next year (String - yes or no) > If yes: add 100 to the cost > If no: subtract 50 from the cost
Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel
        to $allCountries. Your total cost has come out to $costAmount."
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ticketBasePrice = 1000;
        double eachBagCost = 50;
        double eachPersonDiscount = 100;
        double costAmount = 0;
        double totalDiscount = 0;
        double passportRenewal = 200;
        int currentYear = 2022;
        String country = "";

        System.out.println("Have you a valid passport? (yes or no)");
        String validPassport = scan.next();



        if (validPassport.equals("yes")){

            scan.nextLine();
            System.out.println("Which country is your destination?");
            country = scan.nextLine();

            System.out.println("How many bags you have?");
            byte numberOfBags = scan.nextByte();

            System.out.println("How many people you will travel together?");
            short numberOfPeople = scan.nextShort();

            scan.nextLine();
            System.out.println("Enter your name one by one in one line, separating with a comma:");
            String names = scan.nextLine();

            double totalTicketPrice = ticketBasePrice * numberOfPeople;
            double bagsCost = eachBagCost * numberOfBags;
            if (numberOfPeople >= 3){
                switch (numberOfPeople){
                    case 1:
                        totalDiscount = eachPersonDiscount * numberOfPeople;
                        break;

                    case 2:
                        totalDiscount = eachPersonDiscount * numberOfPeople;
                        break;

                    default:
                        totalDiscount = eachPersonDiscount * numberOfPeople;
                }
            }else {
                totalDiscount = eachPersonDiscount * 3;
            }

            costAmount = totalTicketPrice + bagsCost - totalDiscount;
            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + numberOfBags
                                + " bags but you are traveling with " + numberOfPeople + " people, so we are " +
                                "giving a dicount. Your total cost is $" + costAmount);
        }

        if (validPassport.equals("no")){
            System.out.println("When your passport expired?");
            int expiredYear = scan.nextInt();

            scan.nextLine();
            System.out.println("Which country is your destination?");
            country = scan.nextLine();

            System.out.println("Could you traveling in the next year?(yes or no)");
            String nextYearTraveling = scan.next();

            if (nextYearTraveling.equals("yes")){
                costAmount = 200 + (currentYear - expiredYear)*75 + 100;
            }
            if(nextYearTraveling.equals("no")){
                costAmount = 200 + (currentYear - expiredYear)*75 - 50;
            }

            System.out.println("Looks like your password has been expired for " + (currentYear - expiredYear) + " years, " +
                                "but not ot worry we will get it ready for you to travel to " + country + ". Your total" +
                                " cost has come out to " + costAmount);

        }

        scan.close();

    }
}
