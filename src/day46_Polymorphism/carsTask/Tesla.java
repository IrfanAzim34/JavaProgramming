package day46_Polymorphism.carsTask;

public class Tesla extends Car{


    public Tesla(String model, int year, double price, String color, int mileage) {
        super(model, year, price, color, mileage);
    }

    @Override
    public void recall() {
        if (2015 <= getYear()){
            System.out.println(toString());
        }
    }

}
