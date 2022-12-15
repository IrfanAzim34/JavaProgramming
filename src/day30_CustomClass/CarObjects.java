package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota","Corolla","Black",2022,30000);

        System.out.println(car1);

        car1.drive();

        Car car2 = new Car();
        car2.setInfo("Audi","A6","Grey",2019,120000);

        System.out.println(car2);

        car2.drive();

        Car car3 = new Car();
        car3.setInfo("BMW","M5","Green",2000,135000);

        System.out.println(car3);

        car3.drive();


        ArrayList<Car> carsList = new ArrayList<>(Arrays.asList(car1,car2,car3));

        for (Car car : carsList) {
            System.out.println(car.brand + " : " + car.price);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year <= 2008 && p.year >= 2005);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year <= 1997 && p.year >= 1995);

        System.out.println(carsList);


    }

}
