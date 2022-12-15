package day23_CustomMethods_Void;

public class CustomMethodPractice {

    public static void main(String[] args) {

        helloWord5Times();
        helloCydeo5Times();
        evenNumber1to10();
    }

    // create a function that can print hello world 5 times

    public static void helloWord5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }

    // create a function that print hello Cydeo 5 times

    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello Cydeo");
        }

    }

    // create a function that can print all the even numbers from 1 ~ 10

    public static void evenNumber1to10(){
        for (int i = 1; i < 11; i++) {
            if (i % 2 ==0){
                System.out.println(i);
            }
        }
    }

}
