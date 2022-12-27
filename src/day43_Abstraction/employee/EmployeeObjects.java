package day43_Abstraction.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Irfan",29,'M',123,"SDET",120000);
        Developer developer = new Developer("Kayser",27,'M',234,"Java Developer",123000);
        Teacher teacher = new Teacher("Galiba",43,'F',345,"Math Teacher",78000);
        Driver driver = new Driver("John",23,'M',456,"Taxi Driver",34999);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);
        
        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("--------------------------------------------------");

        developer.work();
        developer.sleep();
        developer.unitTest();
        developer.eat();

    }

}
