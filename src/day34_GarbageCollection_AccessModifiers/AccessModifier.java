package day34_GarbageCollection_AccessModifiers;

public class AccessModifier {

    public static int publicData = 100; // access modifier : public
    static int staticData = 200; // access modifier : default
    private static int privateData = 300; // access modifier : private


    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(staticData);
        System.out.println(privateData);

    }

    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Static");
    }

    private static void method3(){
        System.out.println("Private");
    }

}
