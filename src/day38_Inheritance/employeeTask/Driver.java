package day38_Inheritance.employeeTask;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Driver", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " working in " + companyName + " as a " + jobTitle);
    }
}
