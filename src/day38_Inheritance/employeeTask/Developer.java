package day38_Inheritance.employeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Developer", salary, companyName);
    }

    public void work(){
        System.out.println(name + " working in " + companyName + " as a " + jobTitle);
    }

}
