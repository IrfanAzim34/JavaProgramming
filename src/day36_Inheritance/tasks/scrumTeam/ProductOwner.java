package day36_Inheritance.tasks.scrumTeam;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Product Owner", salary, companyName);
    }
}
/*
Create a subclass of Employee named ProductOwner:
Add any extra variable or method that ProductOwner object need to have
 */