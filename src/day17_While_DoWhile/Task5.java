package day17_While_DoWhile;

import java.util.Scanner;

public class Task5 {

    /*
    Create a class called RommReservation, write a program for the room reservation, your program asks
    the user wants to reserve a room.

    if user entered yes, then ask which type of room the user wants to reserve. if user entered no,
    print "have a nice day"(if user entered any invalid answer (other than yes/no) ask user to reenter
    until user provides a valid entry)

            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

    the program should be able to display the room he/she reserved and total price of the room.(if the user selected
    an invalid room, ask the user to reselect the room until user provides a valid entry)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Are you want to reserve a room?(yes / no)");
        String answer = scan.next();
        String result = "";
        int priceOfRoom = 0;

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid answer, please re-enter your answer");
            System.out.println("Are you want to reserve a room?(yes / no)");
            answer = scan.next();
        }

        scan.nextLine();

        if (answer.equals("yes")){
            System.out.println("Which type of room do you want?(King Bed/ Queen Bed/ Single Bed)");
            String typeOfRoom = scan.nextLine();

            while (!(typeOfRoom.equals("King Bed") || typeOfRoom.equals("Queen Bed") || typeOfRoom.equals("Single Bed"))){
                System.err.println("Invalid type of room, please re-enter");
                System.out.println("Which type of room do you want?(King Bed/ Queen Bed/ Single Bed)");
                typeOfRoom = scan.nextLine();
            }

            switch (typeOfRoom){
                case "King Bed":
                    priceOfRoom += 120;
                    break;

                case "Queen Bed":
                    priceOfRoom += 100;
                    break;

                default:
                    priceOfRoom += 80;
            }

            result = typeOfRoom + " ==> " + priceOfRoom + "$";
        }else {
            result = "Have a nice day";
        }

        System.out.println(result);

        scan.close();

    }

}
