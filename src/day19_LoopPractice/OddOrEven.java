package day19_LoopPractice;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0){
                System.out.println("<<" + num + " is a Even number >>");
            }else {
                System.out.println("<<" + num + " is a Odd number >>");
            }

            System.out.println("Would you like to enter another number?");
            String str = scan.next().toLowerCase();

            if (!(str.equals("yes") || str.equals("no"))) {
                System.err.println("Invalid Answer");
                System.exit(0);
            }

            if (str.equals("no"))
                break;

        }

        scan.close();

    }

}
