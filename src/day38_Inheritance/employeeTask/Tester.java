package day38_Inheritance.employeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTile, double salary, String companyName) {
        super(name, age, gender, id, jobTile, salary, companyName);
    }

    public void work(){
        System.out.println(name + " working in " + companyName + " as a " + jobTitle);
    }
}
