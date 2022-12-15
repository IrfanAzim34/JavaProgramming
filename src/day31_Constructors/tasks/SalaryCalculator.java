package day31_Constructors.tasks;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary() * stateTaxRate / 100;
    }

    public double federalTax(){
        return salary() * federalTaxRate / 100;
    }

    public double salaryAfterTax(){
        return salary() - federalTax() - stateTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=%" + stateTaxRate +
                ", federalTaxRate=%" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=$" + salary() +
                ", stateTax=$" + stateTax() +
                ", federalTax=$" + federalTax() +
                ", salaryAfterTax=$" + salaryAfterTax() +
                '}';
    }
}
/*
    SalaryCalculator Task:
    1.1 Create a class named Salary calculator:
            Attributes:
                hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
                Add a constructor to set all the fields
            Actions:
                salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                stateTax(): calculates the totalStateTax
                federalTax(): calculates the total federal tax
                salaryAfterTax(): calculates the salary after tax
                toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */