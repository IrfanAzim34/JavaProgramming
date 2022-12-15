package day05_Concatenation;

public class PhoneNumber {

    public static void main(String[] args) {

        int countryCode = 90,
                areaCode = 212,
                localNumber = 3245563;

        System.out.println("+" + countryCode + "(" + areaCode + ")" + "-" + localNumber);

    }

}

/*
1. create a class named Phone Number and declare the following variables:
                countryCode, areaCode, localNumber
use string concatenation to display the phone number
ex:
    if  countryCode = 1
    areaCode = 703
    localNumber = 4512625
output:
    +1(703)-4512625
 */