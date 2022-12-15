package day12_Scanner;

import java.util.Scanner;

public class LiveWithPeople {

    /*
    Ask the user how many people they live with:

            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people you live with: ");
        int number = input.nextInt();
        String result = "";

        if (number < 3){
            result = "Live with less than 3 people";
        } else if (3 <= number && number <= 6) {
            result = "Live with 3-6 people ";
        }else {
            result = "Live with more than 6 people";
        }

        System.out.println(result);

        input.close();

    }

}
