package day42_Exceptions;

class FadyExceptions extends RuntimeException{

    public FadyExceptions(String message){
        super(message);
    }

}

public class CustomExceptions {

    public static void main(String[] args) {

        throw new FadyExceptions("It's time for short break");



    }

}
