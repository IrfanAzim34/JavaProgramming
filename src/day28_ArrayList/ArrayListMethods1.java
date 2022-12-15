package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); //
        numbers.add(20); //
        numbers.add(30); //
        numbers.add(40); //
        numbers.add(50); //
        numbers.add(60); //
        numbers.add(2,25);

        System.out.println(numbers);
        System.out.println(numbers.size());

        int x = numbers.get(3);
        System.out.println(x);

        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("Java");

        list.set(4,"C++");
        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Neira");
        employees.add("Hulya");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);




    }

}
