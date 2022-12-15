package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Irfan Teipov",
                buildingNumber = "E4",
                streetName = "Bridle Street",
                city ="Atlanta",
                state = "Georgia";
        int zipCode = 30301;

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state+ " " + zipCode;
        System.out.println(address);

        //


    }

}

/*
1. Create a class called ShippingAddress.java

2. Declare the following variables:
        1. name
        2. buildingNumber
        3. streetName
        4. city
        5. state
        6. zipCode

3. Use concatenation to print the full address
 */