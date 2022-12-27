package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) {

        System.out.println("Hello");

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello World");

    }

    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds * 1000));

    }

}
