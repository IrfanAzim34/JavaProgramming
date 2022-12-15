package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Irfan",'M',21,123456,'A');

        Student student2 = new Student();
        student2.setInfo("Hulya",'F',26,234123,'B');

        Student student3 = new Student();
        student3.setInfo("Elminur",'F',26,376490,'A');

        Student student4 = new Student();
        student4.setInfo("Ali",'M',28,987435,'B');

        Student student5 = new Student();
        student5.setInfo("Mert",'M',26,659812,'C');

        Student[] students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(Arrays.asList(students));
        ArrayList<Student> angryBirds = new ArrayList<>(Arrays.asList(students));

        earlyBirds.removeIf(p-> p.grade != 'A');
        angryBirds.removeIf(p-> p.grade == 'A');

        for (Student earlyBird : earlyBirds) {
            System.out.println(earlyBird);
        }

        System.out.println();

        for (Student angryBird : angryBirds) {
            System.out.println(angryBird);
        }


    }

}
