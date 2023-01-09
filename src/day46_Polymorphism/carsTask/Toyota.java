package day46_Polymorphism.carsTask;

public class Toyota extends Car{


    public Toyota(String model, int year, double price, String color, int mileage) {
        super(model, year, price, color, mileage);
    }

    @Override
    public void recall() {
        if (2010 <= getYear() && getYear() <= 2011){
            System.out.println(toString());
        }
    }


}
