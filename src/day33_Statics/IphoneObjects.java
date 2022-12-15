package day33_Statics;

public class IphoneObjects {

    public static void main(String[] args) {

        System.out.println(Iphone.brand);
        Iphone iphone = new Iphone();
        iphone.model = "iphone13";
        iphone.price = 1200;

        Iphone.printOS();



    }

}
