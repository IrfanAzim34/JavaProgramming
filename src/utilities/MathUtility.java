package utilities;

public class MathUtility {

    // This method can return the sum of two numbers
    public static int sumOf2Numbers(int num1, int num2){

        int sum = num1 + num2;
        return sum;

    }
    public static double sumOf2Numbers(double num1, double num2){

        double sum = num1 + num2;
        return sum;

    }
    

    // This method can return the subtraction of two numbers
    public static int subtractionOf2Numbers(int num1, int num2){

        int sub = num1 - num2;
        return sub;

    }
    public static double subtractionOf2Numbers(double num1, double num2){

        double sub = num1 - num2;
        return sub;

    }



    // This method can return the multiplication of two numbers
    public static int multiplicationOf2Numbers(int num1, int num2){

        int mul = num1 * num2;
        return mul;

    }
    public static double multiplicationOf2Numbers(double num1, double num2){

        double mul = num1 * num2;
        return mul;

    }


    // This method can return the division of two numbers
    public static double divisionOf2Numbers(double num1, double num2){

        double div = num1 / num2;
        return div;

    }


    // This method can check if a number is even number
    public static boolean evenNumber(int num){

        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }

    }
    // This method can check if an integer is odd number
    public static boolean oddNumber(int num){

        if (num % 2 != 0){
            return true;
        }else {
            return false;
        }

    }


    // This method can return the maximum number between two number
    public static int maxNumber(int num1, int num2){

        int max = 0;

        if (num1 > num2){
            max = num1;
        } else if (num1 < num2) {
            max = num2;
        }else {
            max = num1;
        }

        return max;

    }
    public static double maxNumber(double num1, double num2){

        double max = 0;

        if (num1 > num2){
            max = num1;
        } else if (num1 < num2) {
            max = num2;
        }else {
            max = num1;
        }

        return max;

    }


    // This method can return the minimum number between two numbers
    public static int minNumber(int num1, int num2){
        
        int min = 0;
        
        if (num1 < num2){
            min = num1;
        } else if (num1 > num2) {
            min = num2;
        }else {
            min = num1;
        }
        
        return min;

    }
    public static double minNumber(double num1, double num2){

        double min = 0;

        if (num1 < num2){
            min = num1;
        } else if (num1 > num2) {
            min = num2;
        }else {
            min = num1;
        }

        return min;

    }


    // this method can return the square of a number
    public static int squareOfNumber(int num){
        
        int square = num * num;
        
        return square;
        
    }
    public static double squareOfNumber(double num){

        double square = num * num;

        return square;

    }



    // This method can return the cube of a number
    public static int cubeOfNumber(int num){
        
        int cube = num * num * num;
        return cube;
        
    }
    public static double cubeOfNumber(double num){

        double cube = num * num * num;
        return cube;

    }

}
