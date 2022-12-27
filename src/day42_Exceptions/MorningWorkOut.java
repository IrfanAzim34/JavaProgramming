package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            System.out.print("\rPush up " + (i+1));
            sleep(2);
        }

    }


    public static void sleep(double seconds){
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
