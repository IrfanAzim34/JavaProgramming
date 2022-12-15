package day10_NestedIf;

public class CrewAndPassangers {

    /*
    Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine how many
    need to be crew members and how many can be passengers. Print how many of each type there should be.

                                        Total: 50  ====> 20 crew, 30 passengers
                                        Total: 75  ====> 25 crew, 50 passengers
                                        Total: 100 ====> 30 crew, 70 passengers
                                        Any other number of people on the ship is not valid

                               NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */

    public static void main(String[] args) {

        int number = 96;
        String message;

        /*
        String result = (50 <= number && number <= 100)? (number == 50)?"20 Crew, 30 passanger"
                :(number == 75)? "25 crew, 50 passanger" :"30 crew, 70 passanger"
                :"Invalid Number";

         */

        if (50 <= number && number <= 100){
            if (number == 50){
                message = "20 Crew, 30 passanger";
            } else if (number == 75) {
                message = "25 crew, 50 passanger";
            } else if (number == 100) {
                message = "30 crew, 70 passanger";
            }else {
                message = "Invalid";
            }
        }else {
            message = "invalid";
        }

        System.out.println(message);

    }
}
