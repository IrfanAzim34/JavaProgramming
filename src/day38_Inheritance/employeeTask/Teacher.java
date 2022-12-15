package day38_Inheritance.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Teacher", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " working in " + companyName + " as a " + jobTitle);
    }
}
