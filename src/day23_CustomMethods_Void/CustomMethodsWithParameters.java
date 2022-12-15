package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(12);
        ageOfPerson(1993,2022);
        betweenXToYNumbers(2,10);
    }

    // create a function that can check if a number is odd number or even number

    public static void oddOrEven(int number){
        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display the age of the person

    public static void ageOfPerson(int birthYear,int currentYear){
        int age = currentYear - birthYear;
        System.out.println("Yor age is " + age);
    }

    // create a function that can print all the number X to Y

    public static void betweenXToYNumbers(int startAt,int endAt){
        for (int i = startAt+1; i < endAt; i++) {
            System.out.print(i + " ");
        }

    }



}
