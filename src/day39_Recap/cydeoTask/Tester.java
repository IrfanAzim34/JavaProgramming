package day39_Recap.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Tester", salary);
    }

    public void creatingTicket(){
        System.out.println(getJobTitle() + " " + getName() + " is creating test ticket");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is working on test case");
    }
}
