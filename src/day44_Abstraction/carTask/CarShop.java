package day44_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry",2018,90000,"Black");
        Honda honda = new Honda("Civic",2020,80000,"White");
        BMW bmw = new BMW("X5",2021,150000,"Grey");
        Audi audi = new Audi("A6",2022,160000,"Black");
        Mercedes mercedes = new Mercedes("S Class",2021,130000,"Red");
        Tesla tesla = new Tesla("Model 3",2020,140000,"White");
        Nio nio = new Nio("Z3",2019,67000,"Yellow");
        CydeoCar cydeoCar = new CydeoCar("WoodenSpoon",2023,200000,"Green");

        System.out.println("--------------------------------------------------------------------");

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(nio);
        System.out.println(cydeoCar);

        System.out.println("---------------------------------------------------------------------");

        toyota.start();
        toyota.drive();

        audi.start();
        audi.drive();
        audi.autoPark();

        tesla.start();
        tesla.drive();
        tesla.autoPark();
        tesla.selfDrive();

        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();

    }

}
