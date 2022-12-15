package day35_Encapsulation.task;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large"))){

            System.err.println("Invalid Size, please re-enter pizza size");
            System.exit(0);

        }


        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping <= 0){
            System.err.println("Invalid Number of Topping");
            System.exit(0);
        }

        if (size.equalsIgnoreCase("small")){
            if (numberOfCheeseTopping > 3){
                System.err.println("You only can select Max 3 Cheese Topping");
                System.exit(0);
            }
        }

        if (size.equalsIgnoreCase("medium")){
            if (numberOfCheeseTopping > 4){
                System.err.println("You only can select Max 4 Cheese Topping");
                System.exit(0);
            }
        }

        if (size.equalsIgnoreCase("large")){
            if (numberOfCheeseTopping > 5){
                System.err.println("You only can select Max 5 Cheese Topping");
                System.exit(0);
            }
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping <= 0){
            System.err.println("Invalid Number of Pepperoni Topping");
            System.exit(0);
        }

        if (size.equalsIgnoreCase("medium")){
            if (numberOfCheeseTopping > 4){
                System.err.println("You only can select Max 4 Pepperoni Topping");
                System.exit(0);
            }
        }

        if (size.equalsIgnoreCase("medium")){
            if (numberOfCheeseTopping > 5){
                System.err.println("You only can select Max 5 Pepperoni Topping");
                System.exit(0);
            }
        }

        if (size.equalsIgnoreCase("medium")){
            if (numberOfCheeseTopping > 6){
                System.err.println("You only can select Max 6 Pepperoni Topping");
                System.exit(0);
            }
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double totalCost = 0;
        if (size.equalsIgnoreCase("small")){
            totalCost = 10 + 2 * ( numberOfCheeseTopping + numberOfPepperoniTopping );
        } else if ((size.equalsIgnoreCase("medium"))) {
            totalCost = 12 + 2 * ( numberOfCheeseTopping + numberOfPepperoniTopping );
        } else if (size.equalsIgnoreCase("large")) {
            totalCost = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }

        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost=$" + calcCost() +
                '}';
    }
}
/*
Create class named Pizza:
    private variables:
        size, numberOfCheeseTopping,numberOfPepperoniTopping

    Encapsulate all the fields
        Conditions:
            size of the pizza can only be small, medium, large. case insensitive
            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                        small: 3
                        medium: 4
                        large: 5
            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
                        small: 4
                        medium: 5
                        large: 6
    Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)

    Methods:
        calcCost(): returns the totalCost of the pizza
        toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as
                    calculated by calcCost()
                                                Pizza cost is determined by:
                                                        S: $10 + $2 per topping
                                                        M: $12 + $2 per topping
                                                        L: $14 + $2 per topping
 */