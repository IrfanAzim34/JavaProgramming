package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(300);
        list.add(300);
        list.add(300);
        list.add(500);
        list.add(600);
        list.add(700);

        Integer num = 300;

        list.remove(num);
        list.remove(num);
        list.remove(num);

        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('A');
        characters.add('A');

        System.out.println(characters.indexOf('A'));
        System.out.println(characters.lastIndexOf('A'));

        System.out.println("-----------------------------------------------------------------------------------------");

        boolean r1 = characters.contains('F');
        System.out.println(r1);

        System.out.println("-----------------------------------------------------------------------------------------");
        
        ArrayList<Integer> list1 = new ArrayList<>();
        
        list1.add(100);
        list1.add(100);
        list1.add(100);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));

        System.out.println("-----------------------------------------------------------------------------------------");

        boolean r2 = list1.isEmpty();
        System.out.println(r2);

    }

}
