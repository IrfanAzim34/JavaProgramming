package day36_Inheritance.tasks.scrumTeam;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }

}
/*
Create a subclass of Employee named Tester:
    Add any extra variable or method that Tester object need to have
 */