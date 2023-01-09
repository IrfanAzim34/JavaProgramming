package day46_Polymorphism.carsTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color, int mileage) {
        super(model, year, price, color, mileage);
    }

    @Override
    public void recall() {
        if (1929 < getYear() && getYear() <= 2022){
            System.out.println(toString());
        }
    }


}
