package day08_IfStatement;

public class ChangeValueWithoutThirdVariable {

    public static void main(String[] args) {

        int x = 25;
        int y = 56;
        x += y;
        y = x-y;
        x -= y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
