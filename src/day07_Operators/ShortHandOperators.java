package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        // assignment: =
        int number =100;
        System.out.println("number = " + number);

        number = 200;
        System.out.println("number = " + number);

        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        System.out.println("-----------------------------------------------------------------------------------------");

        // Addition Assignment: +=
        int x =100;
        x += 100;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println(str);

        double num1 = 2.5;
        num1 += 5.5;
        System.out.println(num1);

        System.out.println("-----------------------------------------------------------------------------------------");

        // subtraction Assignment: -=
        double availableBalance = 1300.5;
        availableBalance -= 500;
        System.out.println(availableBalance);

        System.out.println("-----------------------------------------------------------------------------------------");

        // Multiplication Assignment: *=
        double salary = 50000.50;
        salary *= 2;
        System.out.println(salary);

        System.out.println("-----------------------------------------------------------------------------------------");

        // Division Assignment: /=
        double num2 = 25000;
        num2 /= 2;
        System.out.println(num2);

        System.out.println("-----------------------------------------------------------------------------------------");

        // Remainder Assignment: %=
        double num3 = 100;
        num3 %= 3;
        System.out.println(num3);

    }

}
