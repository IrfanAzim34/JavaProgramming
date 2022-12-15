package day36_Inheritance.tasks.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 14 ProMax","Large",1200,"White");
        System.out.println(iphone);
        iphone.call(5364300344L);
        iphone.text(5364300344L);
        iphone.faceTime(5364300344L);
        iphone.faceTime("irfanteipov@gmail.com");

        System.out.println("-----------------------------------------------------------------------------------------");

        Samsung samsung = new Samsung("S23 Ultra","Large",1250,"Black");
        System.out.println(samsung);
        samsung.call(5364300344L);
        samsung.text(5364300344L);
        samsung.freeze();

        System.out.println("-----------------------------------------------------------------------------------------");

        Nokia nokia = new Nokia("9455","Medium",800,"Red");
        System.out.println(nokia);
        nokia.call(5364300344L);
        nokia.text(5364300344L);
        nokia.selfDefence();

    }

}
