package day39_Recap.cydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Developer", salary);
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is working on developing app");
    }

    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }

}
