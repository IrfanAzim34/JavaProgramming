package day20_Arrays;

import java.util.Scanner;

public class ItemsAndPrices {

    public static void main(String[] args) {

        String[] items = new String[5];
        double[] prices = new double[5];
        double total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a item");
            items[i] = scan.next();
            System.out.println("Enter the item's price");
            prices[i] = scan.nextDouble();
            total += prices[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Item: " + items[i] + " -- price: " + prices[i]);
        }

        System.out.println("Total = " + total);
    }

}
