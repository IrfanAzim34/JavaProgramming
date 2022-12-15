package day36_Inheritance.tasks.scrumTeam;

public class Employee extends Person{

    public int id;
    public String jobTitle;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working");
    }

    public String toString() {
        return "{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", company=" + companyName + '\'' +
                '}';
    }
}
/*
Create a subclass of Person named Employee
    Extra variables:
        id, jobTitle, salary, companyName
    Extra methods:
        SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
        Hint: after creating setInfo method of employee class, you can call the inherited setInfo() to set the
                name, age, and gender
        work()
        toString(): generate toString separately in Employee class so that name, age, gender, id, jobTitle and salary of
                    the employee can be displayed
 */