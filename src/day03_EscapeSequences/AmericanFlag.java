package day03_EscapeSequences;

public class AmericanFlag {

    public static void main(String[] args) {

        /*

        System.out.print("* * * * * * ==================================" +
                "\n * * * * *  ==================================" +
                "\n* * * * * * ==================================" +
                "\n * * * * *  ==================================" +
                "\n* * * * * * ==================================" +
                "\n * * * * *  ==================================" +
                "\n* * * * * * ==================================" +
                "\n * * * * *  ==================================" +
                "\n* * * * * * ==================================" +
                "\n==============================================" +
                "\n==============================================" +
                "\n==============================================" +
                "\n==============================================" +
                "\n==============================================" +
                "\n==============================================");
        */

        String line01 = "* * * * * * ==================================";
        String line02 = " * * * * *  ==================================";
        String line03 = "==============================================";

        System.out.print(line01 + "\n" + line02 + "\n" + line01 + "\n" + line02 +
                "\n" + line01 + "\n" + line02 + "\n" + line01 +"\n"+ line02 + "\n" + line01 +
                "\n" + line03 + "\n" + line03 + "\n" + line03 + "\n" + line03 + "\n" + line03 + "\n" +line03);
    }

}
