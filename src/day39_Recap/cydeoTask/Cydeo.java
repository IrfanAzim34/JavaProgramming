package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester = new Tester("Irfan",29,'m',1234,120000);
        Developer developer = new Developer("Nancy",43,'f',2345,150000);
        Teacher teacher = new Teacher("Galiba",55,'f',3456,70000);
        Student student = new Student("Imran",23,'m',4567,"Math");

        System.out.println("---------------------------------------------------------------------------");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-----------------------------------------------------------------------------");



        student.study();
        student.eat("Burger");
        student.drink("Bear");
        student.sleep();

    }

}
