package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States" ,"Turkey", "United Kingdom", "Canada"};

        // converting array to arraylist
        ArrayList<String> countriesList = new ArrayList<>(Arrays.asList(countries));

        countriesList.removeIf(name -> name.length() >= 10);

        // converting arraylist to array
        countries = countriesList.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));

    }

}
