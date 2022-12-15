package day05_Concatenation;


public class FullName {

    public static void main(String[] args) {

        String firstName = "Vicente";
        String lastName = "Amigo";
        int age = 27;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 10000.58;

        String fullName = firstName + " " + lastName;

        // Full name of the person is ____.
        System.out.println("Full name of the person is " + fullName + ".");

        // ___ is ___ years old.
        System.out.println(fullName + " is " + age + " years old.");

        // FullName is JobTitle + at + CompanyName, and FullName's salary is ____.
        System.out.println(fullName + " is " + jobTitle + " at " + companyName +
                ", and " + fullName + "'s salary is $" + salary);

    }

}


/*
1. Create a class called FullName.java

2. Declare the following variables:
         1.firstName
         2.lastName

3. Use concatenation to print the full address
 */