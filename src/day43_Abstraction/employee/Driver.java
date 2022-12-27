package day43_Abstraction.employee;

public final class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName() + " is driving");
    }


    public void sleep() {
        System.out.println(getName() + " sleeps 10 hours");
    }
}
