package day33_Statics;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Irfan");
        Student student2 = new Student("Irfan",'M');
        Student student3 = new Student("Irfan",1234);
        Student student4 = new Student("Irfan",1234,'A');
        Student student5 = new Student("Irfan",'M',29);
        Student student6 = new Student("Irfan",'M',29,1234);
        Student student7 = new Student("Irfan",'M',29,1234,'A');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

    }

}
