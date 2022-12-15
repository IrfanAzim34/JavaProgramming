package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Irfan",198567,'M',"Developer",120000,true);

        Employee employee2 = new Employee();
        employee2.setInfo("Kayser",287598,'M',"QA",85000,true);

        Employee employee3 = new Employee();
        employee3.setInfo("Ayse",873546,'F',"QA",45000,false);

        Employee employee4 = new Employee();
        employee4.setInfo("Lina",273647,'F',"Manager",80000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Kevin",987453,'M',"Senior QA",110000,true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double minSalary = employees[0].salary;
        double maxSalary = employees[0].salary;

        for (Employee employee : employees) {
            if(employee.isFullTime == true){
                countFullTime++;
            }else {
                countPartTime++;
            }

            if (employee.salary < minSalary){
                minSalary = employee.salary;
            }

            if (employee.salary > maxSalary){
                maxSalary = employee.salary;
            }
        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);


    }

}
