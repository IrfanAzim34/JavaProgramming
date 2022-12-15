package day38_Inheritance.employeeTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Scrum Master", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " working in " + companyName + " as a " + jobTitle);
    }
}
