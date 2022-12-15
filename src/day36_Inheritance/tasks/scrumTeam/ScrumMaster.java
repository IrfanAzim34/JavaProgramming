package day36_Inheritance.tasks.scrumTeam;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Scrum Master", salary, companyName);
    }
}
/*
Create a subclass of Employee named ScrumMaster:
Add any extra variable or method that ScrumMaster object need to have
 */