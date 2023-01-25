package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","F");
        employeeMap.put("Winfred","M");
        employeeMap.put("Jereme","M");
        employeeMap.put("Glad","F");
        employeeMap.put("Desirae","F");
        employeeMap.put("Kakalina","F");
        employeeMap.put("Bertrando","M");
        employeeMap.put("Ajay","F");
        employeeMap.put("Brigitte","F");
        employeeMap.put("Derk","M");
        employeeMap.put("Orlando","M");
        employeeMap.put("Selle","F");
        employeeMap.put("Marika","F");

        System.out.println(employeeMap);

        // 1. Update the 'M' to Male and 'F' to Female

//        for (String eachKey : employeeMap.keySet()) {
//            if (employeeMap.get(eachKey).equalsIgnoreCase("f")){
//                employeeMap.replace(eachKey,"Female");
//            }
//            if (employeeMap.get(eachKey).equalsIgnoreCase("m")){
//                employeeMap.replace(eachKey,"Male");
//            }
//        }

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals("F")){
                entry.setValue("Female");
            }
            if (entry.getValue().equals("M")){
                entry.setValue("Male");
            }
        }

        System.out.println(employeeMap);

        // 2. Display the names of all female employees
        System.out.println("Female Employees: ");
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals("Female")){
                System.out.println("\t" + entry.getKey());
            }
        }

    }

}
