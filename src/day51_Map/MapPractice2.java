package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String,Integer> employees = new LinkedHashMap<>();
        employees.put("John",123000);
        employees.put("Antony",100000);
        employees.put("Jimmy",115000);
        employees.put("James",110000);
        employees.put("Conor",85000);
        employees.put("Josh",117000);
        employees.put("Cory",118000);
        employees.put("Anderson",125000);
        employees.put("Steven",135000);

        // 1.1 who has the maximum salary?
        // 1.2 who has the minimum salary?

        int maxSalary = Collections.max(employees.values());
        int minSalary = Collections.min(employees.values());

        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (entry.getValue() == minSalary){
                System.out.println(entry.getKey() + " has minimum salary");
            }
            if (entry.getValue() == maxSalary){
                System.out.println(entry.getKey() + " has maximum salary");
            }
        }

        System.out.println("--------------------------------------------");

        // 1.3 how many employees has the salary between 120K ~ 150k

        int count = 0;
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (120000 <= entry.getValue() && entry.getValue() <= 150000){
                count++;
            }
        }
        System.out.println(count + " employees has the salary between 120k ~ 150k");

        System.out.println("------------------------------------------------------");

        // 1.4 display the names of the employees who are making less than 118k

        System.out.println("List of who are making less than 118k:");

        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (entry.getValue() < 118000){
                System.out.println("\t" + entry.getKey());
            }
        }

        System.out.println("--------------------------------------------------------");

        // 1.5 increase the salary each employee by 10k

        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            entry.setValue(entry.getValue() + 10000);
        }

        System.out.println(employees);

    }

}
