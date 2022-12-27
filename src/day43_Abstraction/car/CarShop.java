package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        Audi audi = new Audi("RS6","Black",2022,120000);
        Honda honda = new Honda("Accord","White",2020,40000);
        Tesla tesla = new Tesla("Model3","Red",2021,60000);


        System.out.println(audi);
        System.out.println(honda);
        System.out.println(tesla);

        System.out.println("-----------------------------------------------------");



    }

}
