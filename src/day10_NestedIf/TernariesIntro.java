package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n =200;

        /*if (n%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }*/

        String result1 = (n%2 == 0)? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("-----------------------------------------------------------------------------------------");

        int age =23;

        /*
        if (age >= 21){
            System.out.println("eligible");
        }else {
            System.out.println("Not eligible");
        }
        */

        String result2 = (age >= 21)? "eligible" : "Not eligible";

        System.out.println(result2);

        System.out.println("-----------------------------------------------------------------------------------------");

        int num = 0;

        String result3 = (num > 0 )? "Positive" :(num < 0)? "Negative" :"Zero";

        System.out.println(result3);

    }

}
