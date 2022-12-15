package day31_Constructors.tasks;

public class Address {

    public int buildingNumber, zipCode;

    public String street, city, state;

    public Address(int buildingNumber, int zipCode, String street, String city, String state) {
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode ;
    }

}
/*
    Address Task:
    2.1 Create a class named Address
        Attributes:
             buildingNumber, street, city, state, zipCode;
             Add a constructor to set all the fields
        Actions
                toString: returns the address
                            EX:

                                7925 Jones Branch Dr

                                McLean Va, 22012
 */