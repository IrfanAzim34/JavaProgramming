package day36_Inheritance.tasks.scrumTeam;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void fixBug(){
        System.out.println(jobTitle + " " + name + " is fixing bug");
    }
}
/*
Create a subclass of Employee named Developer:
Add any extra variable or method that Developer object need to have
 */