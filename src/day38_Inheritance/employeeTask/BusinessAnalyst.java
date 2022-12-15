package day38_Inheritance.employeeTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Business Analyst", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " working in " + companyName + " as a " + jobTitle);
    }
}
