package day18_NestedLoop;

import javax.swing.plaf.SeparatorUI;
import java.util.Scanner;

public class Task2 {

    /*
    Create a class called RoomReservation, write a program for the room reservation:
                            King Bed ==> 120$
                            Queen Bed ==> 100$
                            Single Bed ==> 80$

     the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
    Then Ask the user "would you like to reserve another room?"
    if yes ==> repeat the entire steps
    if no ==> return the  total price

    If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kingBed = 120, queenBed = 100, singleBed = 80;
        int totalPrice = 0;

        while (true){
            System.out.println("Which bedroom do you want to reserve?(King Bed/ Queen Bed/ Single Bed)");
            String room = scan.nextLine().toLowerCase().replaceFirst(" ", "");

            while (!(room.equals("kingbed") || room.equals("queenbed") || room.equals("singlebed"))){
                System.err.println("Invalid bedroom type!");
                System.out.println("Which bedroom do you want to reserve?(King Bed/ Queen Bed/ Single Bed)");
                room = scan.nextLine().toLowerCase().replaceFirst(" ","");
            }

            System.out.println("How many nights you are staying?");
            int night = scan.nextInt();

            while (night <= 0){
                System.err.println("Invalid number, please re-enter, at least 1 night");
                System.out.println("How many nights you are staying?");
                night = scan.nextInt();
            }


            if (room.equals("kingbed")){
                totalPrice = kingBed * night;
            } else if (room.equals("queenbed")) {
                totalPrice = queenBed * night;
            }else {
                totalPrice = singleBed * night;
            }

            System.out.println("TotalPrice = " + totalPrice);
            System.out.println();

            System.out.println("Would you like to reserve another room?(yes / no)");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer, please re-enter");
                System.out.println("Would you like to reserve another room?(yes / no");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }

            scan.nextLine();
            scan.close();
        }

    }

}
