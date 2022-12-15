package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    /*
            1.1 Ask the user to enter his/her hourlyRate
            1.2 Ask the user how many hours he/she works in a week
            1.3 Ask the user to enter state tax (in percentage)
            1.4 Ask the user to enter federal tax (in percentage)
            1.5 Calculate the:
                    1.4.1 salary
                    1.4.2 stateTax
                    1.4.3 federalTax
                    1.4.4 totalTax
                    1.4.5 netIncome
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        int hourlyRate = input.nextInt();

        System.out.println("How many hours you work in a week?");
        int weeklyHours = input.nextInt();

        double salary = hourlyRate * weeklyHours * 52;

        System.out.println("Enter state tax: ");
        double stateTaxRate = input.nextDouble();

        System.out.println("Enter federal tax: ");
        double federalTaxRate = input.nextDouble();

        double stateTax = salary * stateTaxRate / 100;
        double federalTax = salary * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("salary = $" + salary);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("netIncome = $" + netIncome);

    }
}
