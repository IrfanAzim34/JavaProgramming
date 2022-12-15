package day24_CustomMethods_Retun;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        int num1 = 50, num2 = 50;

        double maxNumber = maxNumber(num1,num2);

        System.out.println(maxNumber);

        double multiplication = maxNumber * 2;

        System.out.println(multiplication);

    }

    public static double maxNumber(double num1, double num2){

        double maxNumber = 0;

        if (num1 > num2){
            maxNumber = num1;
        } else {
            maxNumber = num2;
        }

         return maxNumber;

    }

}
