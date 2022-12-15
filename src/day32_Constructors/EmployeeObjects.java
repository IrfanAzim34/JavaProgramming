package day32_Constructors;

public class EmployeeObjects {


    public static void main(String[] args) {

        Employee employee1 = new Employee("Irfan");
        Employee employee2 = new Employee("Azim",'M');
        Employee employee3 = new Employee("Anna",'F',"QA");
        Employee employee4 = new Employee("David",'M',"SDET",120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }

}
