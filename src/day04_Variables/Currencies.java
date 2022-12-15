package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        /*
         $1000 convert to Lira, euro, ruble, won, indianRupee, japaneseYen, britishPound, canadianDollar,
         rmb, kazakhstanTenge, swissFranc
         */

        int USD = 1000;

        double TRY = USD * 18.23;
        double EUR = USD * 0.99;
        double RUB = USD * 60.07;
        double KRW = USD * 1_376.19;
        double INR = USD * 79.36;
        double JPY = USD * 142.46;
        double GBP = USD * 0.86;
        double CAD = USD * 1.3;
        double RMB = USD * 6.93;
        double KZT = USD * 473.05;
        double CHF = USD * 0.95;

        System.out.println(USD + " Dollar :");
        System.out.println("\tEUR = " + EUR);
        System.out.println("\tTRY = " + TRY);
        System.out.println("\tRUB = " + RUB);
        System.out.println("\tKRW = " + KRW);
        System.out.println("\tINR = " + INR);
        System.out.println("\tJPY = " + JPY);
        System.out.println("\tGBP = " + GBP);
        System.out.println("\tCAD = " + CAD);
        System.out.println("\tRMB = " + RMB);
        System.out.println("\tKZT = " + KZT);
        System.out.println("\tCHF = " + CHF);

    }

}
