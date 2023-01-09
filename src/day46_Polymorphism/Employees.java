package day46_Polymorphism;


import day43_Abstraction.employee.*;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };


        List<Employee> scrumMembers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof Developer){
                scrumMembers.add(employee);
            } else if (employee instanceof Tester) {
                scrumMembers.add(employee);
            }
        }

        List<Tester> testers = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee instanceof Tester){
                if (employee instanceof Tester){
                    testers.add((Tester) employee);
                }
            }
        }

        List<Developer> developers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof Developer){
                developers.add((Developer) employee);
            }
        }

        Employee maxSalaryTester = testers.get(0);
        Employee maxSalaryDev = developers.get(0);
        for (Tester tester : testers) {
            if (tester.getSalary() > maxSalaryTester.getSalary()){
                maxSalaryTester = tester;
            }
        }

        for (Developer developer : developers) {
            if (developer.getSalary() > maxSalaryDev.getSalary()){
                maxSalaryDev = developer;
            }
        }

        System.out.println("maxSalaryTester = " + maxSalaryTester.getName() + " $" + maxSalaryTester.getSalary());
        System.out.println("maxSalaryDev = " + maxSalaryDev.getName() + " $" + maxSalaryDev.getSalary());

    }

}
