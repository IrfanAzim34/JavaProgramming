package day36_Inheritance.tasks.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Irfan",'M',29,1234,"SDET",120000);
        System.out.println(tester);
        tester.work();
        tester.testing();
        tester.creatingTicket();

        System.out.println("-----------------------------------------------------------------------------------------");

        Developer developer = new Developer();
        developer.setInfo("David",'M',25,2345,"Mobil Dev",140000);
        System.out.println(developer);
        developer.work();
        developer.coding();
        developer.fixingBugs();

    }

}
