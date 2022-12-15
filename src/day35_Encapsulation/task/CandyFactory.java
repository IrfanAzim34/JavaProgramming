package day35_Encapsulation.task;

import java.util.ArrayList;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        candies.add(new Candy("Mars",1000, 3,true));
        candies.add(new Candy("Ferrero",2000, 4,false));
        candies.add(new Candy("Mondelez International",1500, 2,false));
        candies.add(new Candy("Mondelez International",4000, 5,true));
        candies.add(new Candy("Haribo",3400, 3,false));

        for (Candy candy : candies) {
            System.out.println(candy.getBrand() + " : " + candy.getPrice());
        }

    }

}
/*
Create a class named CandyFactory
    Create an ArrayList of candies
    Add five objects of candies
    use for each loop to print the brand and price of each candy
 */