package day36_Inheritance.tasks.employeeTask;

public class Teacher extends Employee{

    public void teaching(){
        System.out.println(name + " is teaching now");
    }

}
/*
Create the subclass of Employee named Teacher:
    variables:
        name, gender, age, id, jobTitle, salary
    Methods:
        setInfo()
        work()
        teaching
        toString()
 */