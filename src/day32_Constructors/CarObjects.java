package day32_Constructors;

public class CarObjects {

    public static void main(String[] args) {

    Car car1 = new Car("Audi");
    Car car2 = new Car("Bmw","M3");
    Car car3 = new Car("Honda","Accord",2020);
    Car car4 = new Car("Toyota","Corolla",2019,123000);
    Car car5 = new Car("Hyundai","i3",2016,100000,"Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }

}
