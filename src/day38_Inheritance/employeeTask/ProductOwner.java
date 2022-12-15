package day38_Inheritance.employeeTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Product Owner", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " working in " + companyName + " as a " + jobTitle);
    }
}
