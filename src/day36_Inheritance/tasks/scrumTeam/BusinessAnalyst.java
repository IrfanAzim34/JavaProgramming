package day36_Inheritance.tasks.scrumTeam;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Business Analyst", salary, companyName);
    }
}
/*
Create a subclass of Employee named BusinessAnalyst:
Add any extra variable or method that BusinessAnalyst object need to have
 */